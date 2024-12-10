package com.unit9.test1;

public class Cat {
	//属性
	String nick;
	String color;
	private int age; //私有属性
	double weight;
	//构造方法
	public Cat(String nick, String color,int age, double weight) {
		this.nick = nick;
		this.color = color;
		this.age = age;
		this.weight = weight;
	}
	//实例方法
	public int getAge(String n) {
		int r=-1;
		if(n.equals(this.nick)) {
			r=this.age;
		}
		return r;
	}
	public void run() {
		this.eat();
		System.out.println("一只"+this.age+"岁的猫在慢慢地跑！");
	}
	
	private void eat() {
		System.out.println("猫在吃东西！");
	}
	
	public void sleep() {
		System.out.println("猫在睡觉！");
	}
}
