package com.unit4.test;

public class Test4 {

	public static void main(String[] args) {
		double amount=0;//�ۼƻ�����
		int year=1;
		while(year<=10) {
			amount=amount+2;
			System.out.println("��"+year+"�꣬����2��Ԫ��"
					+ "�ۼƻ���"+amount+"�򣬻�ʣ"+(20-amount)+"��Ԫ��");
			year++;
		}

	}
}
