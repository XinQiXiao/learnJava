package com.unit8.test3;

public class Cat {
	//实例变量
	String nick;
	String color;
	double weight;
	
	//构造方法   没有返回值类型
	public Cat() {
		nick="小白";
		color="黑色";
		weight=2;
		System.out.println("Cat构造方法被执行了！");
	}
	
	//实例方法（具体业务方法，需要使用对象名访问）
	public void run() {
		System.out.println("猫在慢慢地跑！");
	}
	public void eat() {
		System.out.println("猫在吃东西！");
	}
	public void sleep() {
			System.out.println("猫在睡觉！");
	}
}
