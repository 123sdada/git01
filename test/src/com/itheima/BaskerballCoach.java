package com.itheima;

public class BaskerballCoach extends Coach{
    public BaskerballCoach() {
    }

    public BaskerballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("��������̳����⣬������");
    }

    @Override
    public void teach() {
        System.out.println("�����������������Ͷ��");
    }
}
