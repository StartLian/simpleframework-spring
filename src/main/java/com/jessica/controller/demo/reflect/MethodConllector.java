package com.jessica.controller.demo.reflect;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;

@Slf4j
public class MethodConllector {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.jessica.controller.demo.reflect.ReflectTarger");
        Method[] methods = aClass.getMethods();
        for (Method method : methods
        ) {
            log.info("method:" + method);
        }
        log.info("----1------------");
        Method[] methods2 = aClass.getDeclaredMethods();
        for (Method method : methods2
        ) {
            log.info("method:" + method);
        }
        log.info("-----2-----------");
        Method show1 = aClass.getMethod("show1", String.class);
        log.info("show1:" + show1);
        log.info("-----3-调用show1----------");
        ReflectTarger reflectTarger = (ReflectTarger) aClass.getConstructor().newInstance();
        show1.invoke(reflectTarger, "带反射方法一号");
        log.info("-----4单个私有方法-----------");
        Method show4 = aClass.getDeclaredMethod("show4", int.class);
        log.info("show4:" + show4);
        show4.setAccessible(true);
        String invoke = String.valueOf(show4.invoke(reflectTarger, 1));
        log.info("invoke?:"+invoke);
    }
}
