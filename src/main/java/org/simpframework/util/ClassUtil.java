package org.simpframework.util;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;
@Slf4j
public class ClassUtil {

    private static String FILE_PROTOCOL= "file";

    /**
     * 获取包下类集合
     * @return
     */
    public  static Set<Class<?>> extractPackageClass(String packageName) {
        //1.获取到类加载器
        ClassLoader classLoader = getClassLoader();
        URL url = classLoader.getResource(packageName.replace(".","/"));
        //2.通过类加载器获取到加载资源
        if (url == null){
            log.warn(packageName+" is unable to retrieve anything form package");
            return  null;
        }
        //3.依据不同的资源类型，采用不同的方式获取资源集合
        Set<Class<?>> classSet = null;
        if (url.getProtocol().equalsIgnoreCase(FILE_PROTOCOL)){
            classSet = new HashSet<>();
            File packageDirectory = new File(url.getPath());
            ectractClassFile(classSet,packageDirectory,packageName);
        }
        return  classSet;
    }

    /**
     * 递归获取目标package下的所有class文件（包裹package里的class文件）
     * 递归：推进、终止
     * @param emptyClassset
     * @param fileSource
     * @param packageNmae
     */
    private static  void  ectractClassFile(Set<Class<?>> emptyClassset,File fileSource,String  packageNmae){
        if (!fileSource.isDirectory()){
            return;
        }
        File[] files = fileSource.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                if (file.isDirectory()){
                    return true;
                }else {
                    //获取文件的绝对路径
                    String absoluteFilepath = file.getAbsolutePath();
                    if (absoluteFilepath.endsWith(".class")){
                        //如果时class文件，直接加载
                        addtoClassSet(absoluteFilepath);
                    }
                }
                return false;
            }
            //根据class文件的绝对值路径，获取并生成class文件，并放入classset中
            private void addtoClassSet(String absoluteFilepath) {
            //1.从class文件的绝对值路径里提取出包含了package的类名
            absoluteFilepath = absoluteFilepath.replace(File.separator, ".");
            String className = absoluteFilepath.substring(absoluteFilepath.indexOf(packageNmae));//某点后边的内容
            className = className.substring(0,className.lastIndexOf("."));
            //2.通过反射机制获取对应的Class对象并加入到classSet里
            //如E:\files\spring_code\simpleframework\target\classes\com\jessica\entity\dto
            //转为com.jessica.entity.dto
            Class targerClass = loadClass(className);
            emptyClassset.add(targerClass);
            }
        });
        if (files != null){
            for (File f:files) {
                //
                ectractClassFile(emptyClassset,f,packageNmae);
            }
        }
    }
    public static  Class<?> loadClass(String classname){
        try {
            return  Class.forName(classname);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 获取ClassLoader
     * @return
     */
    public  static ClassLoader getClassLoader(){
        //类通过线程执行，
        return Thread.currentThread().getContextClassLoader();
    }

    public static void main(String[] args) {
        extractPackageClass("com.jessica.entity");
    }
}
