package com.unit9.test2;

public class Cat {
	//����
	private String nick;
	private String color;
	private int age; //˽������
	private double weight;
	
	//���췽��
	public Cat(String nick, String color,int age, double weight) {
		this.nick = nick;
		this.color = color;
		this.age = age;
		this.weight = weight;
	}
	
	//get set����
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
	
	
	//ʵ������
	public void run() {
		this.eat();
		System.out.println("һֻ"+this.age+"���è���������ܣ�");
	}
	
	private void eat() {
		System.out.println("è�ڳԶ�����");
	}
	
	public void sleep() {
		System.out.println("è��˯����");
	}
}
