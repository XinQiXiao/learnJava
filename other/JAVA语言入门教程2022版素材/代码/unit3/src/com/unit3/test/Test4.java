package com.unit3.test;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("���������ڼ���1-7����");
		int day=input.nextInt();
		
		if(day==1) {
			System.out.println("�����Ƶ�һ�죡");
		}else if(day==2) {
			System.out.println("��̫���ģ�");
		}else if(day==3) {
			System.out.println("���ޱ��飡");
		}
		else if(day==4) {
			System.out.println("���ģ���ż���");
		}
		else if(day==5) {
			System.out.println("��ȥ�ˣ�����");
		}
		else if(day==6) {
			System.out.println("˯������������");
		}
		else if(day==7) {
			System.out.println("�������㣡");
		}else{
			System.out.println("�������");
		}

	}

}
