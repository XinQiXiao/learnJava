package com.unit4.test;

public class Test8 {

	public static void main(String[] args) {
		
		double p=0.08;
		double m=8844000;
		int t=0;//������۴���
		
		//��ֽ�ĺ��С�����߶�ʱ��ѭ�����ۣ�ֱ���ﵽ���߶�
		while(p<m) {
			p=p*2;//����
			t++;
			System.out.println("��"+t+"�ζ��ۣ���ǰֽ�ĸ߶ȣ�"+p);
		}
		System.out.println("------"+t);

	}

}
