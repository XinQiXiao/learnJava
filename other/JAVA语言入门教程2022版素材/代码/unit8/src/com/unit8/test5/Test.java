package com.unit8.test5;

public class Test {

	public static void main(String[] args) {
		
		//创建对象时自动调用构造方法
		Cat c1=new Cat("小白","白色",2);
		Cat c2=new Cat();
		Cat c3=new Cat("小黄");
		
		//调用方法
		c1.eat();
		c1.eat("鱼");
		
	}

}
