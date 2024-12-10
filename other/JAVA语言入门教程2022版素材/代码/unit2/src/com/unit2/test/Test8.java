package com.unit2.test;

import java.util.Scanner;//引入内部类Scanner

public class Test8 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);//同一个类只需要创建一次
		
		System.out.println("请输入你的年龄：");
		int age=input.nextInt();//用户输入一个int类型的数据，使用a接收
		
		System.out.println("请输入你的身高：");
		double height=input.nextDouble();
		
		System.out.println("请输入你的用户名：");
		String uname=input.next();
		
		System.out.println("您的用户名是"+uname);
		System.out.println("您的年龄是"+age);
		System.out.println("您的身高是"+height);

	}

}
