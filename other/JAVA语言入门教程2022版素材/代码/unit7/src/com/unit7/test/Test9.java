package com.unit7.test;

import java.util.Random;

public class Test9 {
	

	//---------------------
	public static void main(String[] args) {
		
		//�������ȡ1
		double r1=Math.random();//�������һ��0-1֮��ĸ�����
		
		
		//��ȡ�������
		Random rand=new Random();
		//int r2=rand.nextInt(10);//����0-10֮���������������0��������10
		int r2=rand.nextInt(6)+1;
		System.out.println(r2);
	}

}
