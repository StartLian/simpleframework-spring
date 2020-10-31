package com.jessica.controller.demo.anntation;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.AnnotatedElement;

@Slf4j
public class AnnotationDemo {
    public static void main(String[] args) {
        ImoocCourse imoocCourse = new ImoocCourse();
        imoocCourse.getCourseInfo();
        log.info("finish");
//        AnnotatedElement
    }
}
