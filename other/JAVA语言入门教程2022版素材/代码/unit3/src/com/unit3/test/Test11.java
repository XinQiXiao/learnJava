package com.unit3.test;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		System.out.println("�������һ������");
		int a=input.nextInt();
		System.out.println("������ڶ�������");
		int b=input.nextInt();
		System.out.println("������������ţ�+ - * /����");
		String x=input.next();
		
		switch(x) {
			case "+":
				System.out.println("������"+(a+b));
				break;
			case "-":
				System.out.println("������"+(a-b));
				break;
			case "*":
				System.out.println("������"+(a*b));
				break;
			case "/":
				System.out.println("������"+(a/b));
				break;
			default:
				System.out.println("�������");
				break;
		}
		
	}

}
