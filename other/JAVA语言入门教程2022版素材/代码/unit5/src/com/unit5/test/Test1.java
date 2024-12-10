
package com.unit5.test;
import java.util.Scanner;
/*
在选择结构收银台功能中：
1.实现一个顾客可以添加任意个商品，并计算多个商品总数量、总金额；
2.一个顾客结算完之后，立刻开始服务下一个顾客。
 * */
public class Test1 {

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
		
		System.out.println("**************超市收银台***************");
		//重复给多个顾客结算
		while(true) {
			//循环添加多个商品
			int totalNum=0;//总数量
			double totalAmount=0;//总金额
			while(true) {
				System.out.println("请输入商品编号：");
				String id=input.next();
				System.out.println("请输入商品数量：");
				int num=input.nextInt();
				String name="";
				double price=0;
				double amount=0;//单个商品的金额
				if(pId1.equals(id)) {
					name=pName1;
					price=pPrice1;
				}else if(pId2.equals(id)) {
					name=pName2;
					price=pPrice2;
				}else if(pId3.equals(id)) {
					name=pName3;
					price=pPrice3;
				}else {
					System.out.println("没有此商品！");
				}
				amount=price*num;
				System.out.println("您当前添加的商品是："+name+"，单价："+price+"，金额："+amount+"元！");
				
				totalNum+=num;//将单个商品数量加到总数量中
				totalAmount+=amount;//将单个商品金额加到总金额中
				
				System.out.println("继续添加请按1，结算请按2，取消请按3：");
				int c=input.nextInt();
				if(c==2) {
					break;
				}else if(c==3) {
					totalNum=0;//总数量清空
					totalAmount=0;//总金额清空
					System.out.println("-------------------------------");
					continue;
				}
			}
			System.out.println("-----您当前购买了件"+totalNum+"商品，总金额为"+totalAmount+"元！请付款！");
			
			//循环付款找零，直到金额无异常
			while(true) {
				System.out.println("请输入付款金额：");
				double money=input.nextDouble();
				if(money>=totalAmount) {
					System.out.println("付款"+money+"元！找零"+(money-totalAmount)+"元！");
					break;
				}else {
					System.out.println("付款金额不足，请重新付款！");
					continue;
				}
			}
			System.out.println("-------------------------------");
		}
			
		
	}
}
