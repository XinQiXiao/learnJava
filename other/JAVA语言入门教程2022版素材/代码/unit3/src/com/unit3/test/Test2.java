package com.unit3.test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String userName="zhangsan";
		String userPassWord="123abc";
		
		System.out.println("�������û�����");
		String uname=input.next();
		System.out.println("�����������룺");
		String upwd=input.next();
		
		if(userName.equals(uname)&&userPassWord.equals(upwd)) {
			System.out.println("��½�ɹ���");
		}else {
			System.out.println("��½ʧ�ܣ�");
		}

	}

}
