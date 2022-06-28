package com.wkl.design.strategy;

public class Cat implements Comparable<Cat>{
    int height;
    int weight;

    public Cat(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int compatoTo(Cat cat) {
        if (this.height > cat.height) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public int sort(Cat cat) {
        return 0;
    }
}
