package com.itheima;

public class BasketPlayer extends Player{
    public BasketPlayer() {
    }

    public BasketPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("�����˶�Ա��ţ�⣬�����");
    }

    @Override
    public void study() {
        System.out.println("�����˶�Աѧϰ��������Ͷ��");
    }
}
