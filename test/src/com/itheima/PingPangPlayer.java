package com.itheima;

public class PingPangPlayer extends Player implements SpeakEnglish{
    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("ƹ�����˶�Ա�Է�");
    }

    @Override
    public void study() {
        System.out.println("ƹ�����˶�Աѧϰ��η���");
    }

    @Override
    public void Speak() {
        System.out.println("ƹ�����˶�Աѧϰ˵Ӣ��");
    }
}
