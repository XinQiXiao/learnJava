package com.unit9.test11;

public abstract class Animal{
	public String nick;
	public String color;
	public int age;
	
	public Animal(String nick, String color, int age) {
		this.nick = nick;
		this.color = color;
		this.age = age;
	}
	
	//���󷽷��������ڳ�������--û�з�����
	public abstract void eat();
	
	public abstract void sheep();

	public abstract void run(String s);
}
