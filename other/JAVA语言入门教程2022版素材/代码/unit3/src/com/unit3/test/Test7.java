package com.unit3.test;

public class Test7 {

	public static void main(String[] args) {
		double money=3;
		int day=6;
		
		if(money>=100) {
			System.out.println("买宝马！");
			if(day<=5) {
				System.out.println("周末提车！");
			}else {
				System.out.println("下午提车！");
			}
		}
		else if(money>=50) {
			System.out.println("买丰田！");
			if(day<=5) {
				System.out.println("周末提车！");
			}else {
				System.out.println("下午提车！");
			}
		}
		else if(money>=20) {
			System.out.println("买二手车！");
			if(day<=5) {
				System.out.println("周末提车！");
			}else {
				System.out.println("下午提车！");
			}
		}else {
			System.out.println("继续骑单车吧！");
			if(day<=5) {
				System.out.println("骑共享单车！");
			}else {
				System.out.println("骑山地车！");
			}
		}

	}

}
