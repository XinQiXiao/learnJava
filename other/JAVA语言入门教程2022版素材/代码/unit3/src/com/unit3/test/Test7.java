package com.unit3.test;

public class Test7 {

	public static void main(String[] args) {
		double money=3;
		int day=6;
		
		if(money>=100) {
			System.out.println("����");
			if(day<=5) {
				System.out.println("��ĩ�ᳵ��");
			}else {
				System.out.println("�����ᳵ��");
			}
		}
		else if(money>=50) {
			System.out.println("����");
			if(day<=5) {
				System.out.println("��ĩ�ᳵ��");
			}else {
				System.out.println("�����ᳵ��");
			}
		}
		else if(money>=20) {
			System.out.println("����ֳ���");
			if(day<=5) {
				System.out.println("��ĩ�ᳵ��");
			}else {
				System.out.println("�����ᳵ��");
			}
		}else {
			System.out.println("�����ﵥ���ɣ�");
			if(day<=5) {
				System.out.println("�ﹲ������");
			}else {
				System.out.println("��ɽ�س���");
			}
		}

	}

}
