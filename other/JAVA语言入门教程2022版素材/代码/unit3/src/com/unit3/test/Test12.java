package com.unit3.test;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String pwd1="123456";
		String pwd2="123abc";
		System.out.println("�������1�����룺");
		String p1=input.next();
		if(pwd1.equals(p1)) {
			System.out.println("��һ������������ȷ��");
			System.out.println("�������2�����룺");
			String p2=input.next();
			if(pwd2.equals(p2)) {
				System.out.println("��ϲ ����2������������ȷ���õ�5ëǮ");
			}else {
				System.out.println("���ź�����2�������������");
			}
		}else {
			System.out.println("������˼�����ȥ��");
		}
	}

}
