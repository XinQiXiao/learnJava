package com.unit7.test;

public class Test3_A {
	/*
	public�����Ա���Ŀ������λ�÷��ʡ�

	protected����ǰ�࣬���༰ͬһ����������Է��ʡ�
	
	default��Ĭ�ϣ���ͬһ���е�����Է��ʣ�����ʱ�������η���
	
	private��ֻ���ڵ�ǰ����ʡ�
	 */
	
	public static void methodA() {
		System.out.println("public����  methodA��ִ���ˣ�");
	}
	
	protected static void methodB() {
		System.out.println("protected����  methodB��ִ���ˣ�");
	}
	
	static void methodC() {
		System.out.println("Ĭ��  ����  methodC��ִ���ˣ�");
	}
	
	private static void methodD() {
		System.out.println("private  ����  methodD��ִ���ˣ�");
	}
	
	
	
	//main����
	public static void main(String[] args) {
		methodA();
		methodB();
		methodC();
		methodD();
	}

}
