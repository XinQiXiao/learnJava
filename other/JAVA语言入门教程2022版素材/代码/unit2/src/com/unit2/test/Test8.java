package com.unit2.test;

import java.util.Scanner;//�����ڲ���Scanner

public class Test8 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);//ͬһ����ֻ��Ҫ����һ��
		
		System.out.println("������������䣺");
		int age=input.nextInt();//�û�����һ��int���͵����ݣ�ʹ��a����
		
		System.out.println("�����������ߣ�");
		double height=input.nextDouble();
		
		System.out.println("����������û�����");
		String uname=input.next();
		
		System.out.println("�����û�����"+uname);
		System.out.println("����������"+age);
		System.out.println("���������"+height);

	}

}
