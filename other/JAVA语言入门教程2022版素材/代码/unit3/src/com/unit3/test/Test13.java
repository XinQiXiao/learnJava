package com.unit3.test;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String pName1="ƻ��";
		double pPrice1=5;
		String pId1="1001";
		
		String pName2="����";
		double pPrice2=3;
		String pId2="1002";
		
		String pName3="�㽶";
		double pPrice3=4;
		String pId3="1003";
		
		System.out.println("��������Ʒ��ţ�");
		String id=input.next();
		System.out.println("������������");
		double num=input.nextDouble();
		
		double price=0;//������ʱ������Ҫ����ļ۸���Ϣ������ͳһ����
		String name="";//������ʱ������Ҫ�����������Ϣ������ͳһ����
		
		//ͨ����Ʒid�ж���Ʒ�ļ۸�����
		if(pId1.equals(id)) {
			price=pPrice1;
			name=pName1;
		}else if(pId2.equals(id)){
			price=pPrice2;
			name=pName2;
		}else if(pId3.equals(id)){
			price=pPrice3;
			name=pName3;
		}else {
			System.out.println("û�д���Ʒ��");
		}
		double amount=price*num;//������Ʒ���
		System.out.println("��������ǣ�"+name+",��Ʒ���Ϊ��"+amount+"Ԫ��");
		
		//����
		System.out.println("�����븶���");
		double money=input.nextDouble();
		if(money>=amount) {
			System.out.println("����"+money+"Ԫ������"+(money-amount)+"Ԫ��");
		}else {
			System.out.println("������㣡");
		}

	}

}
