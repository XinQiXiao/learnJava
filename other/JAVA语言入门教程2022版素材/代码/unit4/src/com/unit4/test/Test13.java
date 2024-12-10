package com.unit4.test;

public class Test13 {

	public static void main(String[] args) {
		//贷款12万，分10年还清，每个月还款1000元
		double sum=0;
		for(int year=1;year<=10;year++) {
			System.out.println("------------------第"+year+"年到了！");
			for(int month=1;month<=12;month++) {
				sum+=0.1;
				System.out.println("第"+year+"年，第"+month+"月，还款1000元！"
						+ "累计还款"+sum+"万元!");
			}
		}
		

	}

}
