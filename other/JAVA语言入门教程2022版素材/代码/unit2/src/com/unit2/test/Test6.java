package com.unit2.test;

public class Test6 {

	public static void main(String[] args) {
		//自动类型转换
		double weight=137.5;
		int rise=10;
		System.out.println(weight+rise);
		
		
		
		//强制类型转换    可能会损失精度，小数部分被损失掉
		double money=1203.9;
		int pick=100;
		int total=(int)money+pick;
		System.out.println(total);
	}

}
