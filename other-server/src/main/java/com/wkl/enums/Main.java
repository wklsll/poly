package com.wkl.enums;

public class Main {
    public static void main(String[] args) {

        Color c = Color.RED;
        Color c1 = Color.BLUE;
        System.out.println(c1.getIndex());
        System.out.println(c1.getName());
        switch (c) {
            case RED:
                System.out.println("===");
                break;
            case BLUE:
                System.out.println("blue");
                break;
            case PINK:
                System.out.println("pink");
                break;
        }

        for(Color cc : Color.values()){
            System.out.println(cc);
            System.out.println(cc.ordinal());
        }

    }
}
