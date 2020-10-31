package com.jessica.controller.demo.anntation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PersonInfoAnnotation {
   public String name();
   public int age() default 19;
   public  String gendr() default "nan";
    public  String[] language();
}
