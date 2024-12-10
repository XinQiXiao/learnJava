package com.unit9.test11;

//Cat继承Animal类，实现了Pet接口
public class Cat extends Animal implements Pet,Product{
	
	public Cat(String nick, String color, int age) {
		super(nick, color, age);
	}
	//重写父类方法
	public void run(String s) {
		System.out.println("猫：慢慢地跑！");
	}

	public void eat() {
		System.out.println("猫：吃鱼！");
		
	}
	public void sheep() {
		System.out.println("猫：睡觉！");
		
	}
	//实现接口中定义的方法
	public void play() {
		System.out.println("猫在玩耍！");
		
	}

	public void gohome() {
		System.out.println("猫回家了！");
		
	}
	public void sale() {
		System.out.println("猫咪被卖出！");
		
	}


}
