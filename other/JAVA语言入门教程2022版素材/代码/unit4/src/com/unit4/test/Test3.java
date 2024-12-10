package com.unit4.test;

public class Test3 {

	public static void main(String[] args) {
		int sum=0;//保存求和结果，初始值为0
		int i=0;
		while(i<=100) {
			//System.out.println(i);
			sum=sum+i;//每次循环将i加到sum中
			i++;
		}
		System.out.println("求和结果："+sum);

	}

}
