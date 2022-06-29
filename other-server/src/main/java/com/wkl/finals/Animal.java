package com.wkl.finals;

/**
 * final
 * 1、final可以修饰一个类
 * 2、final可以修饰一个方法
 * 3、final可以修饰成员变量，必须赋值（代码块或者构造方法里面去赋值）
 * 4、final可以修饰局部变量,可以先不赋值，在使用的时候必须赋值
 */
// 被final修饰的类不能被继承，太监类，没有子类
public  class Animal {

    //
    public final String name;
    private static int num;

    {
        this.name = "name";
    }


    public static void test() {
        //
        final String a;
        a = "final";
        System.out.println(a);
    }
    public void ttt(){
        System.out.println("i am animal");
    }

    // final修饰方法，方法不可被重写
    public final void finalTest(){

    }

}
