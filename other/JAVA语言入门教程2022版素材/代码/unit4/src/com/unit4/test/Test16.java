package com.unit4.test;

public class Test16 {

	public static void main(String[] args) {
		int year=1;
		while(year<=10) {
			if(year==5) {
				System.out.println("-------------��5�꣬��ͣ���");
				year++;
				continue;//��ֹ��ǰ���ѭ����ֱ����ת����һ��ѭ��
			}
			if(year==6) {
				System.out.println("-------------��6�꣬����4��");
				year++;
				continue;//��ֹ��ǰ���ѭ����ֱ����ת����һ��ѭ��
			}
			if(year==8) {
				System.out.println("-------------��8�꣬��ǰ���������д��");
				break;//��ֹ����ѭ��
			}
			System.out.println("��"+year+"�꣬����2��");
			year++;
		}

	}

}
