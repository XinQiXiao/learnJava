package com.unit4.test;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String msg="n";//保存检查结果，默认为不合格
		do {
			System.out.println("张三开始编写程序....");
			System.out.println("老师开始检查，合格了吗？（y/n）:");
			msg=input.next();
		}while(!("y".equals(msg)));

	}

}
