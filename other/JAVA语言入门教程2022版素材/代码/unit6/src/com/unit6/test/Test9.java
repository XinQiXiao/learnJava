package com.unit6.test;

public class Test9 {

	public static void main(String[] args) {
		//��������  ��ĩβ���8--{1,2,3,4,5,6,7,8}
		int[] oldArray= {1,2,3,4,5,6,7};
		int[] newArray=new int[oldArray.length+1];
		for(int i=0;i<=oldArray.length-1;i++) {
			newArray[i]=oldArray[i];//���������i��λ�õ�ֵ�����������Ӧλ��
		}
		newArray[newArray.length-1]=8;//��ĩβ��ֵ
		
		//�޸������е�ֵ--ֱ�Ӹ�ֵ
		newArray[2]=66;
		
		for(int x:newArray) {
			System.out.println(x);
		}

	}

}
