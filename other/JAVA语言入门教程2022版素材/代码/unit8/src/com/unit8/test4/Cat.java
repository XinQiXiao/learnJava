package com.unit8.test4;

public class Cat {
	//ʵ������
	String nick;
	String color;
	double weight;
	
	//���췽��   û�з���ֵ����
	public Cat(String nick,String color,double weight) {
		this.nick=nick;
		this.color=color;
		this.weight=weight;
		System.out.println("Cat���췽����ִ���ˣ�");
	}


	//ʵ������
	public void run() {
		System.out.println(this.nick+"���������ܣ�");
	}
	public void eat() {
		System.out.println("è�ڳԶ�����");
	}
	public void sleep() {
			System.out.println("è��˯����");
	}
}
