package com.unit8.test3;

public class Test {

	public static void main(String[] args) {
		
		//创建对象时自动调用构造方法
		Cat c=new Cat();
		
		//给对象的属性赋值 
		//c.nick="小白";
		//c.color="黑色";
		//c.weight=2;
		
		//获取对象的属性值
		System.out.println(c.nick+"------"+c.color+"------"+c.weight);
		
	}

}
