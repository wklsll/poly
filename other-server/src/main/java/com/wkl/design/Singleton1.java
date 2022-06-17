package com.wkl.design;

import lombok.extern.slf4j.Slf4j;

/**
 * 单例
 * 饿汉模式
 */
@Slf4j
public class Singleton1 {
    private final static Singleton1 singleton = new Singleton1();
    private Singleton1(){}
    public static Singleton1 getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance1 = Singleton1.getInstance();
        boolean equals = instance.equals(instance1);
        log.info("{}", equals);
    }

}

