package com.unit8.test2;

public class Test {

	public static void main(String[] args) {
		
		//创建对象（实例化）
		Cat c=new Cat();
		Student s=new Student();
		
		//给对象的属性赋值   对象名.属性名=值
		c.nick="小白";
		c.color="黑色";
		c.weight=2;
		
		//获取对象的属性值   对象名.属性名
		System.out.println(c.nick+"------"+c.color+"------"+c.weight);
		
		//调用类中的方法  对象名.方法名（）
		c.eat();
		c.run();
		s.play();
		s.study();

	}

}
