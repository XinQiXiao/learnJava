package com.unit10_login;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("�������û�����");
		String uname=s.next();
		System.out.println("���������룺");
		String upwd=s.next();
		
		String sql="select * from users where name='"+uname+"' and password='"+upwd+"';";
		User user=getOneData.getUser(sql);
		if(user==null) {
			System.out.println("��¼ʧ�ܣ�");
		}else {
			System.out.println("��¼�ɹ�����ӭ�㣬"+user.getName());
		}
		

	}

}
