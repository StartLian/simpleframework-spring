package com.jessica.controller.demo.reflect;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.lang.annotation.Annotation;

@Slf4j
@Data
public class ReflectTarger extends  ReflectTargetOrigin{
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
    private ReflectTarger(int i){
        log.info("有参函数：int:"+i);
    }
    //----------------构造函数--------

    //-----------------字段变量---------------/
    public  String name;
    protected  int index;
    char type;
    private  String targetinfo;

    @Override
    public String toString() {
        return "ReflectTarger{" +
                "name='" + name + '\'' +
                ", index=" + index +
                ", type=" + type +
                ", targetinfo='" + targetinfo + '\'' +
                '}';
    }

    public void  show1(String s){
        log.info("public s:"+s);
    }
    protected  void show2(){
        log.info("protected:");
    }
      void show3(){
        log.info("default:");
    }
    private String show4(int index){
        log.info("private index:"+index);
        return  "show4";
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
