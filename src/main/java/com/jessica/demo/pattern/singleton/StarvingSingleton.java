package com.jessica.demo.pattern.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StarvingSingleton {
        private  static  final  StarvingSingleton starbingsington = new StarvingSingleton();
        private StarvingSingleton(){

        }
        public  static  StarvingSingleton getInstance(){
            return  starbingsington;
        }

    public static void main(String[] args) {
        log.info(StarvingSingleton.getInstance()+"");
    }
}
