package com.unit9.test10;

//子类
public class Cat extends Animal{
	
	public Cat(String nick, String color, int age) {
		super(nick, color, age);//手动调用父类的构造方法
	}

	public void run() {
		System.out.println("猫：慢慢地跑！");
	}

	public void eat() {
		System.out.println("猫：吃鱼！");
		
	}

	public void sheep() {
		System.out.println("猫：睡觉！");
		
	}

	public void run(String s) {
		// TODO Auto-generated method stub
		
	}

}
