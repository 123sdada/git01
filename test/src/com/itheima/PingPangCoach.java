package com.itheima;

public class PingPangCoach extends Coach implements SpeakEnglish{
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("ƹ���������С�ײˣ��ȴ�����");
    }

    @Override
    public void teach() {
        System.out.println("ƹ�����������η���ͽ���");
    }

    @Override
    public void Speak() {
        System.out.println("ƹ�������˵Ӣ��");
    }
}
