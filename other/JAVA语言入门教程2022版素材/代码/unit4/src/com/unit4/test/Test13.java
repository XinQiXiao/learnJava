package com.unit4.test;

public class Test13 {

	public static void main(String[] args) {
		//����12�򣬷�10�껹�壬ÿ���»���1000Ԫ
		double sum=0;
		for(int year=1;year<=10;year++) {
			System.out.println("------------------��"+year+"�굽�ˣ�");
			for(int month=1;month<=12;month++) {
				sum+=0.1;
				System.out.println("��"+year+"�꣬��"+month+"�£�����1000Ԫ��"
						+ "�ۼƻ���"+sum+"��Ԫ!");
			}
		}
		

	}

}
