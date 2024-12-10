package com.unit4.test;

public class Test4 {

	public static void main(String[] args) {
		double amount=0;//累计还款金额
		int year=1;
		while(year<=10) {
			amount=amount+2;
			System.out.println("第"+year+"年，还款2万元！"
					+ "累计还款"+amount+"万，还剩"+(20-amount)+"万元！");
			year++;
		}

	}
}
