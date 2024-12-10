package com.unit3.test;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String pName1="苹果";
		double pPrice1=5;
		String pId1="1001";
		
		String pName2="西瓜";
		double pPrice2=3;
		String pId2="1002";
		
		String pName3="香蕉";
		double pPrice3=4;
		String pId3="1003";
		
		System.out.println("请输入商品编号：");
		String id=input.next();
		System.out.println("请输入数量：");
		double num=input.nextDouble();
		
		double price=0;//用于临时保存需要处理的价格信息，方便统一处理
		String name="";//用于临时保存需要处理的名称信息，方便统一处理
		
		//通过商品id判断商品的价格名称
		if(pId1.equals(id)) {
			price=pPrice1;
			name=pName1;
		}else if(pId2.equals(id)){
			price=pPrice2;
			name=pName2;
		}else if(pId3.equals(id)){
			price=pPrice3;
			name=pName3;
		}else {
			System.out.println("没有此商品！");
		}
		double amount=price*num;//计算商品金额
		System.out.println("您购买的是："+name+",商品金额为："+amount+"元！");
		
		//找零
		System.out.println("请输入付款金额：");
		double money=input.nextDouble();
		if(money>=amount) {
			System.out.println("付款"+money+"元！找零"+(money-amount)+"元！");
		}else {
			System.out.println("付款金额不足！");
		}

	}

}
