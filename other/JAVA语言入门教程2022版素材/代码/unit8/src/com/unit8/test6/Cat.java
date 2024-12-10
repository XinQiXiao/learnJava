package com.unit8.test6;

public class Cat {
	//实例变量
	String nick;
	String color;
	double weight;
	
	//静态变量（类变量）
	static String address="八达岭动物园";
	
	//静态方法
	 public static void show() {
		System.out.println("这是一个动物园系统的猫类！");
	}
	
	//构造方法   
	public Cat(String nick,String color,double weight) {
		this.nick=nick;
		this.color=color;
		this.weight=weight;
		System.out.println("Cat构造方法1被执行了！");
	}
	
	//实例方法
	public void run() {
		System.out.println(address);
		show();
		System.out.println(this.nick+"在慢慢地跑！");
	}
	public void eat() {
		System.out.println("猫在吃东西！");
	}

}
