package com.unit12.test5;

public class Test {
	
	public static void main(String[] args) throws Exception {
		//��ʼ�ʽ�1��Ԫ���껯����50%��50������ж���Ǯ��
		double money=1;
		for(int year=1;year<=30;year++) {
			money=money*1.5;
		}
		System.out.println("30����ҵ�ǮΪ"+money+"��Ԫ��");
		//�ϵ㣺����ִ�е���һ�п�ʼdebug
	}
}
