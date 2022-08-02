package com.itheima;
// 教练类
public abstract class Coach extends Person{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }
    public abstract void teach(); //抽象教方法
}
