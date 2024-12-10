package com.unit4.test;

public class Test12 {

	public static void main(String[] args) {
		// 上有35头，下有94足，问鸡兔各多少只
		// 穷举法:列举所有的可能性，找到正确答案
		for(int j=0;j<=35;j++) {
			int t=35-j;
			if(j*2+t*4==94) {
				System.out.println(j+"----"+t);
			}	
		}

	}

}
