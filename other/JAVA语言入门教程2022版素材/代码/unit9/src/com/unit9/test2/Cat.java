package com.unit9.test2;

public class Cat {
	//属性
	private String nick;
	private String color;
	private int age; //私有属性
	private double weight;
	
	//构造方法
	public Cat(String nick, String color,int age, double weight) {
		this.nick = nick;
		this.color = color;
		this.age = age;
		this.weight = weight;
	}
	
	//get set方法
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0) {
			this.age = age;
		}
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	//实例方法
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
