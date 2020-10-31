package com.jessica.demo.pattern.singleton;

/**
 * 通过枚举获取单例
 * 饿汉模式
 * jad：反编译工具
 */
public class EnumStarvingSingleton {
    private EnumStarvingSingleton(){}
    public static  EnumStarvingSingleton getInstance(){
        return  ContatinerHolder.HOLDER.instance;
    }
    private  enum  ContatinerHolder{
        HOLDER;
        private  EnumStarvingSingleton instance;
        ContatinerHolder(){
            instance = new EnumStarvingSingleton();
        }
    }
}
