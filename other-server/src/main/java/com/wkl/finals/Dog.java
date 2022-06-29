package com.wkl.finals;

public class Dog extends Animal {
    public void ttt(){
        System.out.println("我是dog");
    }
// 因为父类的方法被final修饰，所以不能被重写
//    public  void finalTest(){
//
//    }

}
