package com.unit2.test;

public class Test7 {

	public static void main(String[] args) {
		//���������
		int a1=10;
		double a2=3.14;
		//System.out.println((a1+2-3)*6);
		//�����������������Ҫ������һ����ǿ��ת�������ͣ����ܻ�ȡС�����ֵĽ��
		//System.out.println(a1/(double)3);
		//System.out.println(a2%1);//��ȡ������ģ��
		a1++; //��a1�Լ�1  a1=a1+1
		a2--;
		//System.out.println(a2);
		
		
		//��ֵ�����
		int b1=6;  //���ұߵ�ֵ������ߵı���
		int b2=b1-3;
		b1+=5;  // b1=b1+5
		//System.out.println(b1);
		
		
		//��ϵ�����    ����Ľ����boolean
		int c1=7;
		int c2=7;
		//System.out.println(c1==c2);
		//System.out.println(c1!=c2);
		//System.out.println(c1>=c2);
		//System.out.println(c1<=c2);
		
		
		//�߼������  ����Ľ����boolean,�͹�ϵ��������ʹ��
		int d1=8;
		int d2=6;
//		System.out.println(d1<10 && d2>=5);
//		System.out.println(d1<3 || d2>=9);
//		System.out.println(!(d1>3));
		
		
		//��Ԫ�����(��Ŀ�����)
		int age=39;
		String s=age<=30?"����":"����";
		System.out.println(s);

	}

}
