package com.unit7.test;

public class Test4 {
	//����                     �����б�:�β�
	public static void methodA(String s) {
		System.out.println("methodA��ִ�У�");
		System.out.println("�û�����Ĳ�����"+s);
	}
	
	
	//main����
	public static void main(String[] args) {
		//���÷���ʱ���� ʵ��     
		methodA("����");
		String a="����";
		methodA(a);
		//ʵ�ε��������ͺ�����������β�һ��
	}

}
