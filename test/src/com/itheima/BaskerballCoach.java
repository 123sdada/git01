package com.itheima;

public class BaskerballCoach extends Coach{
    public BaskerballCoach() {
    }

    public BaskerballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球教练教吃羊肉，喝羊奶");
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教如何运球和投篮");
    }
}
