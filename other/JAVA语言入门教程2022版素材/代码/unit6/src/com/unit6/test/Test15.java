package com.unit6.test;

import java.util.Arrays;

public class Test15 {

	public static void main(String[] args) {
		
		int[] scores={11,31,25,17,43};
		
		for(int i=0;i<scores.length-1;i++) {
			System.out.println("��"+(i+1)+"�ֱȽϣ�");
			for(int j=0;j<scores.length-1-i;j++) {
				System.out.println("-------��"+(j+1)+"�αȽϣ�");
				//���ݴ�С�ȽϽ��н���
				if(scores[j]<scores[j+1]) {
					int x=scores[j];
					scores[j]=scores[j+1];
					scores[j+1]=x;
				}
			}
		}
		
		System.out.println(Arrays.toString(scores));

	}
}
