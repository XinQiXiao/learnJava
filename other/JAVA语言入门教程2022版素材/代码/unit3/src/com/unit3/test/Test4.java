package com.unit3.test;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入星期几（1-7）：");
		int day=input.nextInt();
		
		if(day==1) {
			System.out.println("最郁闷的一天！");
		}else if(day==2) {
			System.out.println("不太开心！");
		}else if(day==3) {
			System.out.println("面无表情！");
		}
		else if(day==4) {
			System.out.println("开心！快放假了");
		}
		else if(day==5) {
			System.out.println("出去嗨！！！");
		}
		else if(day==6) {
			System.out.println("睡个懒觉！！！");
		}
		else if(day==7) {
			System.out.println("假期余额不足！");
		}else{
			System.out.println("输入错误！");
		}

	}

}
