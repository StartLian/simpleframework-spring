package com.jessica.controller.demo.reflect;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

@Slf4j
public class FieldConllector {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.jessica.controller.demo.reflect.ReflectTarger");
        //获取所有公共字段
        Field[] fields = aClass.getFields();
        for (Field f: fields){
            log.info("f:"+f);
        }
        //获取所有字段
        log.info("获取所有字段");
        Field[] fields2 = aClass.getDeclaredFields();
        for (Field f: fields2){
            log.info("f2:"+f);
        }
        log.info("获取单个共有");
        Field name = aClass.getField("name");
        log.info("name:"+name);
        ReflectTarger reflectTarger=(ReflectTarger)aClass.getConstructor().newInstance();
        name.set(reflectTarger,"带反射一号");
        log.info("获取name："+reflectTarger.getName());
        log.info("获取单个私有");
        Field targetinfo = aClass.getDeclaredField("targetinfo");
        log.info("targetinfo:"+targetinfo);
        targetinfo.setAccessible(true);
        targetinfo.set(reflectTarger,"带反射er号");
        log.info("yanzhengreflectTarger:"+reflectTarger);
    }
}
