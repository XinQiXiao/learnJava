package com.unit9.test1;

public class Cat {
	//����
	String nick;
	String color;
	private int age; //˽������
	double weight;
	//���췽��
	public Cat(String nick, String color,int age, double weight) {
		this.nick = nick;
		this.color = color;
		this.age = age;
		this.weight = weight;
	}
	//ʵ������
	public int getAge(String n) {
		int r=-1;
		if(n.equals(this.nick)) {
			r=this.age;
		}
		return r;
	}
	public void run() {
		this.eat();
		System.out.println("һֻ"+this.age+"���è���������ܣ�");
	}
	
	private void eat() {
		System.out.println("è�ڳԶ�����");
	}
	
	public void sleep() {
		System.out.println("è��˯����");
	}
}
