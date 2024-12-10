package com.unit6.test;

import java.util.Arrays;

public class Test15 {

	public static void main(String[] args) {
		
		int[] scores={11,31,25,17,43};
		
		for(int i=0;i<scores.length-1;i++) {
			System.out.println("第"+(i+1)+"轮比较！");
			for(int j=0;j<scores.length-1-i;j++) {
				System.out.println("-------第"+(j+1)+"次比较！");
				//根据大小比较进行交换
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
