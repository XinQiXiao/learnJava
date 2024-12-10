package com.unit7.test;

public class Test3_A {
	/*
	public：可以被项目中所有位置访问。

	protected：当前类，子类及同一个包中类可以访问。
	
	default（默认）：同一包中的类可以访问，声明时不加修饰符。
	
	private：只能在当前类访问。
	 */
	
	public static void methodA() {
		System.out.println("public方法  methodA被执行了！");
	}
	
	protected static void methodB() {
		System.out.println("protected方法  methodB被执行了！");
	}
	
	static void methodC() {
		System.out.println("默认  方法  methodC被执行了！");
	}
	
	private static void methodD() {
		System.out.println("private  方法  methodD被执行了！");
	}
	
	
	
	//main方法
	public static void main(String[] args) {
		methodA();
		methodB();
		methodC();
		methodD();
	}

}
