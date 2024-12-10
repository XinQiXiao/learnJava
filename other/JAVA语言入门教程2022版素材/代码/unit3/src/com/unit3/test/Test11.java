package com.unit3.test;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int a=input.nextInt();
		System.out.println("请输入第二个数：");
		int b=input.nextInt();
		System.out.println("请输入运算符号（+ - * /）：");
		String x=input.next();
		
		switch(x) {
			case "+":
				System.out.println("计算结果"+(a+b));
				break;
			case "-":
				System.out.println("计算结果"+(a-b));
				break;
			case "*":
				System.out.println("计算结果"+(a*b));
				break;
			case "/":
				System.out.println("计算结果"+(a/b));
				break;
			default:
				System.out.println("输入错误！");
				break;
		}
		
	}

}
