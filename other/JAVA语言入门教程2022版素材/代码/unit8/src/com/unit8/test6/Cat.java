package com.unit8.test6;

public class Cat {
	//ʵ������
	String nick;
	String color;
	double weight;
	
	//��̬�������������
	static String address="�˴��붯��԰";
	
	//��̬����
	 public static void show() {
		System.out.println("����һ������԰ϵͳ��è�࣡");
	}
	
	//���췽��   
	public Cat(String nick,String color,double weight) {
		this.nick=nick;
		this.color=color;
		this.weight=weight;
		System.out.println("Cat���췽��1��ִ���ˣ�");
	}
	
	//ʵ������
	public void run() {
		System.out.println(address);
		show();
		System.out.println(this.nick+"���������ܣ�");
	}
	public void eat() {
		System.out.println("è�ڳԶ�����");
	}

}
