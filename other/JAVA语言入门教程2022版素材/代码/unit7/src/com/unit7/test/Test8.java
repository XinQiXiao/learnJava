package com.unit7.test;

public class Test8 {

	//ե֭�����û�����ˮ�����ƣ����ض�Ӧ��֭��
	public static String juicer(String f1,String f2) {
		String juice="";
		System.out.println("ե֭����ʼ����......");
		juice=f1+f2+"֭";
		return juice;
	}
	
	
	//---------------------
	public static void main(String[] args) {
		String cup=juicer("�㽶","����");
		System.out.println("ե����һ����"+cup);
	}

}
