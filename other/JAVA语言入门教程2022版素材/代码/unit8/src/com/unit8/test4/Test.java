package com.unit8.test4;

public class Test {

	public static void main(String[] args) {
		
		//��������ʱ�Զ����ù��췽��
		Cat c1=new Cat("С��","��ɫ",2);
		Cat c2=new Cat("С��","��ɫ",3);
		
		//��ȡ���������ֵ
		System.out.println(c1.nick);
		System.out.println(c2.nick);
		
		//���÷���
		c1.run();
		c2.run();
		
	}

}
