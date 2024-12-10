package com.unit9.test8;

//父类
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
		System.out.println("动物在吃东西！");
	}
	
	void sheep() {
		System.out.println("动物在睡觉！");
	}
	
	private void say() {
		System.out.println("动物开口说话！");
	}
	
	public void run(String s) {
		System.out.println("动物在跑！");
	}
	
}
