package com.jessica.demo.pattern.singleton;

public class SingtelonDemo {
    public static void main(String[] args) {
        System.out.println(StarvingSingleton.getInstance());
        System.out.println(StarvingSingleton.getInstance());
        System.out.println(LazyDoubleCkeckSingleton.getInstance());
        System.out.println(LazyDoubleCkeckSingleton.getInstance());
    }
}
