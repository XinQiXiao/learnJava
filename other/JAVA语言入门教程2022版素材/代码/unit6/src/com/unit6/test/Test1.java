package com.unit6.test;

public class Test1 {

	public static void main(String[] args) {
		//动态初始化
//		int[] scores1;//int[] 声明int类型的数组
//		scores1=new int[5];//分配空间 5-数组长度
		int[] scores1=new int[5];
		scores1[0]=67;//赋值  在0位置填充值67
		scores1[1]=56;
		scores1[2]=78;
		scores1[3]=89;
		scores1[4]=98;
		
		//静态初始化
		int[] scores2={45,56,78,67,89};
		
		//数组一旦初始化，长度不可变

	}

}
