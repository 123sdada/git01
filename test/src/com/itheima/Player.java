package com.itheima;

public abstract class  Player extends Person{
    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }
    public abstract void study(); //抽象学习方法
}
