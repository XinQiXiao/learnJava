package com.unit9.test6;

public class Bird extends Animal{

	public Bird(String nick, String color, int age) {
		super(nick, color, age);//手动调用父类的构造方法
	}
	public void run() {
		System.out.println("鸟：跑着跑着就飞起来了！");
	}
}
