package com.unit4.test;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String msg="n";//����������Ĭ��Ϊ���ϸ�
		do {
			System.out.println("������ʼ��д����....");
			System.out.println("��ʦ��ʼ��飬�ϸ����𣿣�y/n��:");
			msg=input.next();
		}while(!("y".equals(msg)));

	}

}
