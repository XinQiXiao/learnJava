package com.unit3.test;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("***************51超市管理系统*****************************");
		System.out.println("-----请输入您的消费金额：");
		double amount=input.nextDouble();
		
		if(amount>=1000) {
			System.out.println("赠送电饭锅一台！！");
			System.out.println("-----是否会员？（1-会员，2-非会员）：");
			int msg=input.nextInt();
			if(msg==1) {
				System.out.println("恭喜你！打九折！");
			}
		}else if(amount>=500) {
			System.out.println("赠送榨汁机一台！！");
		}else if(amount>=200) {
			System.out.println("赠送抽纸一提！！");
		}else{
			System.out.println("谢谢惠顾！");
		}
		
		System.out.println("***************欢迎下次再来*****************************");

	}

}
