package com.unit3.test;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("***************51���й���ϵͳ*****************************");
		System.out.println("-----�������������ѽ�");
		double amount=input.nextDouble();
		
		if(amount>=1000) {
			System.out.println("���͵緹��һ̨����");
			System.out.println("-----�Ƿ��Ա����1-��Ա��2-�ǻ�Ա����");
			int msg=input.nextInt();
			if(msg==1) {
				System.out.println("��ϲ�㣡����ۣ�");
			}
		}else if(amount>=500) {
			System.out.println("����ե֭��һ̨����");
		}else if(amount>=200) {
			System.out.println("���ͳ�ֽһ�ᣡ��");
		}else{
			System.out.println("лл�ݹˣ�");
		}
		
		System.out.println("***************��ӭ�´�����*****************************");

	}

}
