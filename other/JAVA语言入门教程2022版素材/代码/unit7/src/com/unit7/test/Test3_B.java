package com.unit7.test;

public class Test3_B {
	/*
		需要调用另一个类的方法时，需要使用对方类的类名或者对象名
	 */
	
	//main方法
	public static void main(String[] args) {
		Test3_A.methodA();
		Test3_A.methodB();
		Test3_A.methodC();
	}

}
