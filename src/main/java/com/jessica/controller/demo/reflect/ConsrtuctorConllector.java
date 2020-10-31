package com.jessica.controller.demo.reflect;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@Slf4j
public class ConsrtuctorConllector {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Class.forName("com.jessica.controller.demo.reflect.ReflectTarger");
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor c:constructors) {
            log.info("c="+c);
        }
        log.info("-------------");
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor c:declaredConstructors) {
            log.info("c="+c);
        }
        log.info("-------------");
        Constructor constructor = clazz.getConstructor(String.class, int.class);
        log.info("constructor="+constructor);
        Constructor declaredConstructor = clazz.getDeclaredConstructor( int.class);
        log.info("declaredConstructor="+declaredConstructor);
        log.info("调用私有构造函数，创建实例");
        //暴力访问忽略修饰符
        declaredConstructor.setAccessible(true);
        ReflectTarger o = (ReflectTarger)declaredConstructor.newInstance(1);
    }
}
