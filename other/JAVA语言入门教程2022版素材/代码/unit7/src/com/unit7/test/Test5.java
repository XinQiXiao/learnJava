package com.unit7.test;

public class Test5 {
	
	//���뵥������
	public static void getLevel(int score) {
		if(score>=80) {
			System.out.println("���㣡");
		}else if(score>=60) {
			System.out.println("����");
		}else {
			System.out.println("������");
		}
	}
	
	//����������
	public static void getLevelB(int score,String name,String className) {
		System.out.println("�༶��"+className+"����"+name);
		if(score>=80) {
			System.out.println("���㣡");
		}else if(score>=60) {
			System.out.println("����");
		}else {
			System.out.println("������");
		}
	}
	
	//��������
	public static void getSum(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		System.out.println("��ͽ����"+sum);
	}
	

	//main����
	public static void main(String[] args) {
//		getLevel(96);
//		getLevelB(96,"����","2��");
		
		int[] arr= {2132,43,456,57678,7,9};
		getSum(arr);

	}

}
