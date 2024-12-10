package com.unit3.test;

public class Test3 {

	public static void main(String[] args) {
		double money=153;
		
		if(money>=100) {
			System.out.println("买宝马！");
		}
		else if(money>=50) {
			System.out.println("买丰田！");
		}
		else if(money>=20) {
			System.out.println("买二手车！");
		}else {
			System.out.println("继续骑单车吧！");
		}
		
		//if开头（不可省略，只有一个）
		//else if（可以有任意个，可以省略）
		//else末尾 （可以省略，只有一个）
		//else-if语句中，如果前面的条件满足并执行，那么后面的条件无论是否满足都不执行

	}

}
