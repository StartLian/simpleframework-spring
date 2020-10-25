package com.jessica.controller.demo.reflect;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;
@Slf4j
public class ConsrtuctorConllector {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("com.jessica.controller.demo.reflect.ReflectTarger");
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor c:constructors) {
            log.info("c="+c);
        }
    }
}
