package com.unit7.test;

import java.util.Random;

public class Test9 {
	

	//---------------------
	public static void main(String[] args) {
		
		//随机数获取1
		double r1=Math.random();//随机生成一个0-1之间的浮点数
		
		
		//获取随机整数
		Random rand=new Random();
		//int r2=rand.nextInt(10);//生成0-10之间随机整数，包含0，不包含10
		int r2=rand.nextInt(6)+1;
		System.out.println(r2);
	}

}
