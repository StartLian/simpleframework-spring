package com.jessica.controller.demo.anntation;

import lombok.extern.slf4j.Slf4j;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Slf4j
public class AnnotationParser {
    public static void parsertypeAnnotation() throws Exception {
        Class clazz = Class.forName("com.jessica.controller.demo.anntation.ImoocCourse");
        //获取类注解
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation:annotations
             ) {
            CourseInfoAnnotation courseInfoAnnotation = (CourseInfoAnnotation)annotation;
            log.info("kechengmin:"+courseInfoAnnotation.coursename());
        }
    }
    //获取成员变量的标签
    public static void parserFileAnnotation() throws Exception {
        Class clazz = Class.forName("com.jessica.controller.demo.anntation.ImoocCourse");
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f:declaredFields
             ) {
            //判断成员变量中是否有指定类型注解
            boolean annotationPresent = f.isAnnotationPresent(PersonInfoAnnotation.class);
            if (annotationPresent){
                PersonInfoAnnotation annotation = f.getAnnotation(PersonInfoAnnotation.class);
                log.info("name:"+annotation.name());
                String[] language = annotation.language();
                for (String str:language
                     ) {
                    log.info("language:"+language);
                }
            }
        }
    }
    //获取成员方法的标签
    public static void parserMethodAnnotation() throws Exception {
        Class clazz = Class.forName("com.jessica.controller.demo.anntation.ImoocCourse");
        Method[] declaredFields = clazz.getMethods();
        for (Method f:declaredFields
             ) {
            //判断成员变量中是否有指定类型注解
            boolean annotationPresent = f.isAnnotationPresent(CourseInfoAnnotation.class);
            if (annotationPresent){
                CourseInfoAnnotation annotation = f.getAnnotation(CourseInfoAnnotation.class);
                log.info("coursename:"+annotation.coursename());

            }
        }
    }
    public static void main(String[] args) throws Exception {
//        parsertypeAnnotation();
        parserFileAnnotation();
//        parserMethodAnnotation();
    }
}
