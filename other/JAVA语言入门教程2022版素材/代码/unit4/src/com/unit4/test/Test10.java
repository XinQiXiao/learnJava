package com.unit4.test;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name="zhangsan";
		String password="123qaz";
		boolean msg=false; //�����¼״̬  true-�ɹ�  false-ʧ��
		int i=0; //��¼��¼����
		do {
			i++;
			if(i!=1) {
				System.out.println("��¼ʧ�ܣ������µ�¼��");
			}
			System.out.println("�������û�����");
			String uname=input.next();
			System.out.println("���������룺");
			String upwd=input.next();
			if(name.equals(uname)&&password.equals(upwd)) {
				msg=true;
			}
		}while(!msg);
		
		if(msg) {
			System.out.println("��ϲ�㣡��¼�ɹ���");
		}

	}

}
