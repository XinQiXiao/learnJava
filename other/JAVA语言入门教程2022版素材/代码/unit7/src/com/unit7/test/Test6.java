package com.unit7.test;

public class Test6 {
	//����ֵ
	
	//������ͽ��
	public static int getSum(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		return sum; //�������ݣ�����д�ڷ���ִ�е�ĩβ
	}
	
	//---------------------
	public static void main(String[] args) {
		int[] arr= {13,2,54,6,768,9,89};
		int result=getSum(arr);//ִ�з�������ȡ���ؽ��
		System.out.println("��ͽ����"+result);
	}

}
