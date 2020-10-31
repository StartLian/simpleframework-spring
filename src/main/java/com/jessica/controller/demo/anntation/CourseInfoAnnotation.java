package com.jessica.controller.demo.anntation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseInfoAnnotation {
    public  String coursename();
    public  String corsetag();
    public  String corseprofile();
    public  int corseIndex() default 303;
}
