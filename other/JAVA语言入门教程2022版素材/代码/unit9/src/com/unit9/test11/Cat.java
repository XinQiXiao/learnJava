package com.unit9.test11;

//Cat�̳�Animal�࣬ʵ����Pet�ӿ�
public class Cat extends Animal implements Pet,Product{
	
	public Cat(String nick, String color, int age) {
		super(nick, color, age);
	}
	//��д���෽��
	public void run(String s) {
		System.out.println("è���������ܣ�");
	}

	public void eat() {
		System.out.println("è�����㣡");
		
	}
	public void sheep() {
		System.out.println("è��˯����");
		
	}
	//ʵ�ֽӿ��ж���ķ���
	public void play() {
		System.out.println("è����ˣ��");
		
	}

	public void gohome() {
		System.out.println("è�ؼ��ˣ�");
		
	}
	public void sale() {
		System.out.println("è�䱻������");
		
	}


}
