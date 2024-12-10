package com.unit3.test;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("您周几过来就餐（1-7）：");
		int day=input.nextInt();
		
		if(day==1) {
			System.out.println("特价菜：水煮鱼！");
		}else if(day==2) {
			System.out.println("特价菜：烧排骨！");
		}else if(day==3 || day==4) {
			System.out.println("特价菜：宫保鸡丁！");
		}else{
			System.out.println("特价菜：干锅肥肠！");
		}
		
		
	
	}

}
