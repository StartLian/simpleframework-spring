package com.jessica.controller.demo.reflect;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReflectTarger {
    public ReflectTarger(String str){
        log.info("有参函数："+str);
    }
    public ReflectTarger(String str,int i){
        log.info("有参函数："+str+" int:"+i);
    }
    public ReflectTarger(){
        log.info("wu参函数：");
    }
    private ReflectTarger(boolean str){
        log.info("siyou有参函数："+str);
    }
    public static void main(String[] args) throws ClassNotFoundException {

        ReflectTarger reflectTarger = new ReflectTarger();
        Class targerClass = reflectTarger.getClass();
        log.info("1->targerClassname:"+targerClass.getName());
        Class targerClass2 = ReflectTarger.class;
        log.info("2->targerClassname:"+targerClass2.getName());
        log.info((targerClass == targerClass2)+" ");
        Class targerClass3 = Class.forName("com.jessica.controller.demo.reflect.ReflectTarger");
        log.info("3->targerClassname:"+targerClass3.getName());
    }
}
