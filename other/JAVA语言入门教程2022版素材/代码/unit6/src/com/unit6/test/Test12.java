package com.unit6.test;
import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[] numArray= {"1001","1002","1003","1004","1005"};//保存商品编号
		String[] nameArray= {"苹果","香蕉","梨子","葡萄","西瓜"};//保存商品名称
		double[] priceArray= {5,3,4,12,2};//保存商品价格
		
		//显示商品列表
		System.out.println("编号----------名称------------价格");
		for(int i=0;i<numArray.length;i++) {
			System.out.println(numArray[i]+"---"+nameArray[i]+"---"+priceArray[i]);
		}
		System.out.println("--------------------------------");
		
		//商品上架（增加商品）
		String[] numArray2=new String[numArray.length+1];//保存商品编号
		String[] nameArray2=new String[nameArray.length+1];//保存商品名称
		double[] priceArray2=new double[priceArray.length+1];//保存商品价格
		while(true) {
			int msg=0;//保存是否需要重新输入 0不需要 1需要
			
			System.out.println("请输入商品编号：");
			String num=input.next();
			for(String n:numArray) {
				if(num.equals(n)) {
					System.out.println("商品编号已存在，请重新输入！");
					msg=1;
					break;
				}
			}
			if(msg==1) {
				continue;
			}
			
			System.out.println("请输入商品名称：");
			String name=input.next();
			for(String x:nameArray) {
				if(name.equals(x)) {
					System.out.println("商品名称已存在，请重新输入！");
					msg=1;
					break;
				}
			}
			if(msg==1) {
				continue;
			}
			
			System.out.println("请输入商品价格：");
			double price=input.nextDouble();
			
			//添加数据
			for(int i=0;i<numArray.length;i++) {
				numArray2[i]=numArray[i];
				nameArray2[i]=nameArray[i];
				priceArray[i]=priceArray[i];
			}
			numArray2[numArray2.length-1]=num;
			nameArray2[nameArray2.length-1]=name;
			priceArray2[priceArray2.length-1]=price;
			break;
		}
		
		//显示商品列表
		System.out.println("编号----------名称------------价格");
		for(int i=0;i<numArray2.length;i++) {
			System.out.println(numArray2[i]+"---"+nameArray2[i]+"---"+priceArray2[i]);
		}
		System.out.println("--------------------------------");
	}
}
