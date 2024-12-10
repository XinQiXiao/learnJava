package com.unit2.test;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		/*1.加法计算器
		用户输入两个数，打印出求和结果。
		*/
//		System.out.println("请输入第一个数：");
//		double num1=input.nextDouble();
//		System.out.println("请输入第二个数：");
//		double num2=input.nextDouble();
//		System.out.println("两个数的和是："+(num1+num2));
		

		/*2.年龄验证
		用户输入一个年龄，判断是不是正确年龄18，正确输出true,错误输出false.
		*/
//		System.out.println("请输入您的年龄：");
//		int age=input.nextInt();
//		boolean msg=age==18?true:false;
//		System.out.println("结果："+msg);

		/*3.计算周长面积
		用户输入圆的半径，通过计算打印出圆的周长和面积。
		（以3.14作为圆周率）
		*/
		System.out.println("输入圆的半径：");
		double r=input.nextDouble();
		double c=2*3.14*r;//周长
		double s=3.14*r*r;//面积
		System.out.println("周长："+c+"面积："+s);


	}

}
