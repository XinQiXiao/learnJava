package com.unit4.test;

public class Test14 {

	public static void main(String[] args) {
		//51超市中，苹果5元一个，梨子3元一个，香蕉1元3个，
		//现有100块钱买100个水果，三种水果各多少个？（元，个为最小单位）
		//苹果 0-20  梨子0-33  香蕉0-100，3的倍数
		for(int a=0;a<=20;a++) {
			for(int b=0;b<=33;b++) {
				for(int c=0;c<=100;c=c+3) {
					if(a+b+c==100 && a*5+b*3+c/3==100) {
						System.out.println(a+"---"+b+"---"+c);
					}
				}
			}
		}
		//百钱买百鸡

	}

}
