package com.jessica.demo.pattern.singleton;

/**
 * 安全获取实例，的懒汉式
 */
public class LazyDoubleCkeckSingleton {
    private  volatile  static  LazyDoubleCkeckSingleton instance;
    private  LazyDoubleCkeckSingleton(){}
    public  static LazyDoubleCkeckSingleton getInstance(){
        if (instance == null){
            synchronized (LazyDoubleCkeckSingleton.class){
                if (instance == null){
                    //memory =allocate();//分配内存空间
                    //2.instance(memory);//初始化对象
                    //3.instance =memory//设置instance指定杠分配的内存地址，此时instance！= null；
                    //2.3顺序不定
                    instance =new LazyDoubleCkeckSingleton();
                }
            }
        }
        return instance;
    }
}
