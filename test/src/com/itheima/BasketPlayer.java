package com.itheima;

public class BasketPlayer extends Player{
    public BasketPlayer() {
    }

    public BasketPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃牛肉，喝洋酒");
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习如何运球和投篮");
    }
}
