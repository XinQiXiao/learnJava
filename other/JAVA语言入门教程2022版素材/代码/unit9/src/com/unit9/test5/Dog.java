package com.unit9.test5;

//子类
public class Dog extends Animal{
	String strain;
	public void play() {
		System.out.println("狗狗在玩！");
	}
	public void run(int i) {
		System.out.println("狗：飞快的跑！");
	}
}
