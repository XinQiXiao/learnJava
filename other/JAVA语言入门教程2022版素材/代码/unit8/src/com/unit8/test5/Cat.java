package com.unit8.test5;

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
		System.out.println("Cat���췽��1��ִ���ˣ�");
	}
	
	//���췽������
	public Cat() {
		System.out.println("Cat���췽��2��ִ���ˣ�");
	}
	
	//���췽������
	public Cat(String nick) {
		this.nick=nick;
		System.out.println("Cat���췽��3��ִ���ˣ�");
	}
	
	//ʵ������
	public void run() {
		System.out.println(this.nick+"���������ܣ�");
	}
	public void eat() {
		System.out.println("è�ڳԶ�����");
	}
	//ʵ����������
	public void eat(String sth) {
		System.out.println("è�ڳ�"+sth+"��");
	}

}
