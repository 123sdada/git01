package com.itheima;

public class PensonDemo {
    public static void main(String[] args) {
        PingPangPlayer ppp=new PingPangPlayer();
        ppp.setName("����");
        ppp.setAge((30));
        System.out.println(ppp.getName()+","+ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.Speak();
        BasketPlayer bt=new BasketPlayer();
        bt.setName("Ҧ��");
        bt.setAge(35);
        System.out.println(bt.getName()+","+bt.getAge());
        bt.eat();
        bt.study();
    }
}
