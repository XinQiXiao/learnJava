package com.unit12.test4;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws Exception {
		Exception ex=new Exception("密码长度必须为6位！"); //创建异常对象
		Scanner s=new Scanner(System.in);
		System.out.println("请输入密码（长度必须6位）：");
		String pwd=s.next();
		
		if(pwd.length()==6) {
			System.out.println("密码设置成功！");
		}else {
			throw ex;//抛出自定义异常对象
		}
	}
}
