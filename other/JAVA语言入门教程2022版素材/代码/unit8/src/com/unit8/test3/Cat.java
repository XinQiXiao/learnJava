package com.unit8.test3;

public class Cat {
	//ʵ������
	String nick;
	String color;
	double weight;
	
	//���췽��   û�з���ֵ����
	public Cat() {
		nick="С��";
		color="��ɫ";
		weight=2;
		System.out.println("Cat���췽����ִ���ˣ�");
	}
	
	//ʵ������������ҵ�񷽷�����Ҫʹ�ö��������ʣ�
	public void run() {
		System.out.println("è���������ܣ�");
	}
	public void eat() {
		System.out.println("è�ڳԶ�����");
	}
	public void sleep() {
			System.out.println("è��˯����");
	}
}
