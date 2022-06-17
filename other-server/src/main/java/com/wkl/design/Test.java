package com.wkl.design;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {
    public static void main(String[] args) {
        //Singleton1 singleton1 = new Singleton1();
        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance1 = Singleton1.getInstance();
        boolean equals = instance.equals(instance1);
        log.info("{}", equals);
    }
}
