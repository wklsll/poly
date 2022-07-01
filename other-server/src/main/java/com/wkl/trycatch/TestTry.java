package com.wkl.trycatch;

public class TestTry {

    public static void main(String[] args) {

        try {
          //throw  new RuntimeException();
            // 退出程序的时候就不会执行finally的代码
          System.exit(0);
        }finally {
            System.out.println("111111111");
        }
    }
}
