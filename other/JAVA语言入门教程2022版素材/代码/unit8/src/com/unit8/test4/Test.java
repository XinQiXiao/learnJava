package com.unit8.test4;

public class Test {

	public static void main(String[] args) {
		
		//创建对象时自动调用构造方法
		Cat c1=new Cat("小白","白色",2);
		Cat c2=new Cat("小黑","黑色",3);
		
		//获取对象的属性值
		System.out.println(c1.nick);
		System.out.println(c2.nick);
		
		//调用方法
		c1.run();
		c2.run();
		
	}

}
