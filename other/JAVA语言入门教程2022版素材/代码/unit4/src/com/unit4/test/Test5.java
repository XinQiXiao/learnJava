package com.unit4.test;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int i=1;
		int maxAge=0;
		int minAge=0;
		//����һ��������Ϊ���ֵ�ĳ�ʼֵ��Ȼ��ÿ�ν��µ���������ֵ���Աȣ�������󣬾ͽ��µ�������Ϊ���ֵ
		while(i<=5) {
			System.out.println("�������"+i+"�����䣺");
			int age=input.nextInt();
			if(i==1) {
				maxAge=age;//����һ��ֵ�������ֵ����Ϊ��ʼֵ	
				minAge=age;
			}else {
				if(age>maxAge) {
					maxAge=age;
				}
				if(age<minAge) {
					minAge=age;
				}
			}
			i++;
		}
		System.out.println("���ֵ��"+maxAge);
		System.out.println("��Сֵ��"+minAge);

	}

}
