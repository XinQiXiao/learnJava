package com.unit8.test5;

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
		System.out.println("Cat构造方法1被执行了！");
	}
	
	//构造方法重载
	public Cat() {
		System.out.println("Cat构造方法2被执行了！");
	}
	
	//构造方法重载
	public Cat(String nick) {
		this.nick=nick;
		System.out.println("Cat构造方法3被执行了！");
	}
	
	//实例方法
	public void run() {
		System.out.println(this.nick+"在慢慢地跑！");
	}
	public void eat() {
		System.out.println("猫在吃东西！");
	}
	//实例方法重载
	public void eat(String sth) {
		System.out.println("猫在吃"+sth+"！");
	}

}
