package com.unit4.test;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name="zhangsan";
		String password="123qaz";
		boolean msg=false; //保存登录状态  true-成功  false-失败
		int i=0; //记录登录次数
		do {
			i++;
			if(i!=1) {
				System.out.println("登录失败！请重新登录！");
			}
			System.out.println("请输入用户名：");
			String uname=input.next();
			System.out.println("请输入密码：");
			String upwd=input.next();
			if(name.equals(uname)&&password.equals(upwd)) {
				msg=true;
			}
		}while(!msg);
		
		if(msg) {
			System.out.println("恭喜你！登录成功！");
		}

	}

}
