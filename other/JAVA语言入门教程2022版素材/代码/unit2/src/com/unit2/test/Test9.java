package com.unit2.test;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		/*1.�ӷ�������
		�û���������������ӡ����ͽ����
		*/
//		System.out.println("�������һ������");
//		double num1=input.nextDouble();
//		System.out.println("������ڶ�������");
//		double num2=input.nextDouble();
//		System.out.println("�������ĺ��ǣ�"+(num1+num2));
		

		/*2.������֤
		�û�����һ�����䣬�ж��ǲ�����ȷ����18����ȷ���true,�������false.
		*/
//		System.out.println("�������������䣺");
//		int age=input.nextInt();
//		boolean msg=age==18?true:false;
//		System.out.println("�����"+msg);

		/*3.�����ܳ����
		�û�����Բ�İ뾶��ͨ�������ӡ��Բ���ܳ��������
		����3.14��ΪԲ���ʣ�
		*/
		System.out.println("����Բ�İ뾶��");
		double r=input.nextDouble();
		double c=2*3.14*r;//�ܳ�
		double s=3.14*r*r;//���
		System.out.println("�ܳ���"+c+"�����"+s);


	}

}
