package com.unit9.test6;

//子类
public class Dog extends Animal{
	String strain;
	public Dog(String nick, String color, int age,String strain) {
		super(nick, color, age);//手动调用父类的构造方法
		this.strain=strain;
	}

	public void play() {
		System.out.println("狗狗在玩！");
	}
	public void run() {
		super.run("a");//调用父类方法
		System.out.println("狗：飞快的跑！");
	}
}
