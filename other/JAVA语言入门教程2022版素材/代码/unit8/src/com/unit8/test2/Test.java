package com.unit8.test2;

public class Test {

	public static void main(String[] args) {
		
		//��������ʵ������
		Cat c=new Cat();
		Student s=new Student();
		
		//����������Ը�ֵ   ������.������=ֵ
		c.nick="С��";
		c.color="��ɫ";
		c.weight=2;
		
		//��ȡ���������ֵ   ������.������
		System.out.println(c.nick+"------"+c.color+"------"+c.weight);
		
		//�������еķ���  ������.����������
		c.eat();
		c.run();
		s.play();
		s.study();

	}

}
