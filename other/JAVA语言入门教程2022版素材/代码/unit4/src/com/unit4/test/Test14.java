package com.unit4.test;

public class Test14 {

	public static void main(String[] args) {
		//51�����У�ƻ��5Ԫһ��������3Ԫһ�����㽶1Ԫ3����
		//����100��Ǯ��100��ˮ��������ˮ�������ٸ�����Ԫ����Ϊ��С��λ��
		//ƻ�� 0-20  ����0-33  �㽶0-100��3�ı���
		for(int a=0;a<=20;a++) {
			for(int b=0;b<=33;b++) {
				for(int c=0;c<=100;c=c+3) {
					if(a+b+c==100 && a*5+b*3+c/3==100) {
						System.out.println(a+"---"+b+"---"+c);
					}
				}
			}
		}
		//��Ǯ��ټ�

	}

}
