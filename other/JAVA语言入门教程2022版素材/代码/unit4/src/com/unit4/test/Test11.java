package com.unit4.test;

public class Test11 {

	public static void main(String[] args) {
		
//		for(int i=1;i<=100;i++) {
//			System.out.println("第"+i+"次打印：你好！世界！");
//		}
		
		int sum=0;
		for(int i=0;i<=100;i+=3) {
			System.out.println(i);
			sum+=i;
		}
		System.out.println("---------"+sum);

	}

}
