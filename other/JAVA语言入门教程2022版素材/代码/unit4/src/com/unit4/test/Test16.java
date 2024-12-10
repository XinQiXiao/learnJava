package com.unit4.test;

public class Test16 {

	public static void main(String[] args) {
		int year=1;
		while(year<=10) {
			if(year==5) {
				System.out.println("-------------第5年，暂停还款！");
				year++;
				continue;//中止当前这次循环，直接跳转到下一次循环
			}
			if(year==6) {
				System.out.println("-------------第6年，还款4万！");
				year++;
				continue;//中止当前这次循环，直接跳转到下一次循环
			}
			if(year==8) {
				System.out.println("-------------第8年，提前还清了所有贷款！");
				break;//终止整个循环
			}
			System.out.println("第"+year+"年，还款2万！");
			year++;
		}

	}

}
