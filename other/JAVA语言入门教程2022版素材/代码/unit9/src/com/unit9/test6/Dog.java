package com.unit9.test6;

//����
public class Dog extends Animal{
	String strain;
	public Dog(String nick, String color, int age,String strain) {
		super(nick, color, age);//�ֶ����ø���Ĺ��췽��
		this.strain=strain;
	}

	public void play() {
		System.out.println("�������棡");
	}
	public void run() {
		super.run("a");//���ø��෽��
		System.out.println("�����ɿ���ܣ�");
	}
}
