package com.unit3.test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String userName="zhangsan";
		String userPassWord="123abc";
		
		System.out.println("请输入用户名：");
		String uname=input.next();
		System.out.println("请输入用密码：");
		String upwd=input.next();
		
		if(userName.equals(uname)&&userPassWord.equals(upwd)) {
			System.out.println("登陆成功！");
		}else {
			System.out.println("登陆失败！");
		}

	}

}
