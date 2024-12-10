package com.unit4.test;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int i=1;
		int maxAge=0;
		int minAge=0;
		//将第一个年龄作为最大值的初始值，然后每次将新的年龄和最大值作对比，如果更大，就将新的年龄作为最大值
		while(i<=5) {
			System.out.println("请输入第"+i+"个年龄：");
			int age=input.nextInt();
			if(i==1) {
				maxAge=age;//将第一个值赋给最大值，作为初始值	
				minAge=age;
			}else {
				if(age>maxAge) {
					maxAge=age;
				}
				if(age<minAge) {
					minAge=age;
				}
			}
			i++;
		}
		System.out.println("最大值："+maxAge);
		System.out.println("最小值："+minAge);

	}

}
