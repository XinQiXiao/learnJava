package com.unit12.test4;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws Exception {
		Exception ex=new Exception("���볤�ȱ���Ϊ6λ��"); //�����쳣����
		Scanner s=new Scanner(System.in);
		System.out.println("���������루���ȱ���6λ����");
		String pwd=s.next();
		
		if(pwd.length()==6) {
			System.out.println("�������óɹ���");
		}else {
			throw ex;//�׳��Զ����쳣����
		}
	}
}
