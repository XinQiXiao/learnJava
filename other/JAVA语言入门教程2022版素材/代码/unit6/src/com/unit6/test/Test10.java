package com.unit6.test;

public class Test10 {

	public static void main(String[] args) {
		//ָ��λ����������--- �±�3λ�������Ԫ��0-- {1,2,3,0,4,5,6,7}
		int[] oldArray= {1,2,3,4,5,6,7};
		              //{1,2,3,0,4,5,6,7}
		int[] newArray=new int[oldArray.length+1];
		
		for(int i=0;i<=newArray.length-1;i++) {
			if(i<3) {
				newArray[i]=oldArray[i];//ֱ�ӿ���
			}else if(i==3) {
				newArray[3]=0;//��ӵ�ֵ
			}else if(i>3) {
				newArray[i]=oldArray[i-1];//������������
			}
		}
		
		for(int x:newArray) {
			System.out.println(x);
		}
		
		

	}
}
