package com.unit9.test8;

//����
public class Animal {
	public String nick;
	public String color;
	public int age;
	
	public Animal(String nick, String color, int age) {
		this.nick = nick;
		this.color = color;
		this.age = age;
	}

	public void eat() {
		System.out.println("�����ڳԶ�����");
	}
	
	void sheep() {
		System.out.println("������˯����");
	}
	
	private void say() {
		System.out.println("���￪��˵����");
	}
	
	public void run(String s) {
		System.out.println("�������ܣ�");
	}
	
}
