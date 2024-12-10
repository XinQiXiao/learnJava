package com.unit8.test4;

public class Cat {
	//实例变量
	String nick;
	String color;
	double weight;
	
	//构造方法   没有返回值类型
	public Cat(String nick,String color,double weight) {
		this.nick=nick;
		this.color=color;
		this.weight=weight;
		System.out.println("Cat构造方法被执行了！");
	}


	//实例方法
	public void run() {
		System.out.println(this.nick+"在慢慢地跑！");
	}
	public void eat() {
		System.out.println("猫在吃东西！");
	}
	public void sleep() {
			System.out.println("猫在睡觉！");
	}
}
