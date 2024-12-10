package com.unit8.test6;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		//创建对象时自动调用构造方法
		Cat c1=new Cat("小白","白色",2);

		//调用方法
		//c1.eat();
		
		//访问静态变量
		//System.out.println(Cat.address);
		//System.out.println(c1.address);
		
		//调用静态方法
		//Cat.show();
		//c1.show();
		
		c1.run();
		

		
	}

}
