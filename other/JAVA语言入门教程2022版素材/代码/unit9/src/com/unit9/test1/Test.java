package com.unit9.test1;

public class Test {

	public static void main(String[] args) {
		
		Cat c=new Cat("С��","��ɫ",2,3);
		int r=c.getAge("С��");
		System.out.println(r);
		c.run();
	}
}
