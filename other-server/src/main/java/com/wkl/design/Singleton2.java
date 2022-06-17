package com.wkl.design;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 单例模式
 * 懒汉式
 */
@Slf4j
public class Singleton2 {
    private static Singleton2 singleton2 = null;


    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(50000);
        for (int i =0;i<30000000;i++){
            int finalI = i;
            executor.execute(()->{
                boolean equals = Singleton2.getInstance().equals(Singleton2.getInstance());
               // log.info("{}", finalI);
                if(!equals){
                    log.info("{}",finalI);
                    log.info("===================");
                }
            });
        }
        executor.shutdown();

    }


}
