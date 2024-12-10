package com.unit3.test;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String pwd1="123456";
		String pwd2="123abc";
		System.out.println("请输入第1道密码：");
		String p1=input.next();
		if(pwd1.equals(p1)) {
			System.out.println("第一道密码输入正确！");
			System.out.println("请输入第2道密码：");
			String p2=input.next();
			if(pwd2.equals(p2)) {
				System.out.println("恭喜 ！第2道密码输入正确！拿到5毛钱");
			}else {
				System.out.println("很遗憾！第2道密码输入错误！");
			}
		}else {
			System.out.println("不好意思！请出去！");
		}
	}

}
