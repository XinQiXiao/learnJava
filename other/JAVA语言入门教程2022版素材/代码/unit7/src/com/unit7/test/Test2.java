package com.unit7.test;

public class Test2 {
	//public:��������Ŀ�ж����Ե����������
	//static:��̬����������ֱ�ӵ��õķ���
	//void:û�з���ֵ
	//�����������ֻ�е��òŻ�ִ��
	public static void myFirstMethod() {
		System.out.println("������ִ���ˣ�");
	}

	public static void main(String[] args) {
		for(int i=0;i<1000;i++) {
			myFirstMethod();
		}
	}

}
