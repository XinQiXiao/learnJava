package com.unit8.test7;
import java.util.Scanner;

public class UserTest {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		User a=new User("zhangsan","123");
		User b=new User("lisi","1234");
		User c=new User("wangwu","12345");
		
		System.out.println("请输入用户名：");
		String inputName=in.next();
		System.out.println("请输入密码：");
		String inputPwd=in.next();
		String result=a.login(inputName, inputPwd);
		
		if("成功".equals(result)) {
			System.out.println("登录成功!");
		}else {
			System.out.println("登录失败!");
		}
	}

}
