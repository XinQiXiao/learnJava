package com.unit6.test;

public class Test9 {

	public static void main(String[] args) {
		//增加数据  在末尾添加8--{1,2,3,4,5,6,7,8}
		int[] oldArray= {1,2,3,4,5,6,7};
		int[] newArray=new int[oldArray.length+1];
		for(int i=0;i<=oldArray.length-1;i++) {
			newArray[i]=oldArray[i];//将旧数组第i个位置的值赋给新数组对应位置
		}
		newArray[newArray.length-1]=8;//给末尾赋值
		
		//修改数组中的值--直接赋值
		newArray[2]=66;
		
		for(int x:newArray) {
			System.out.println(x);
		}

	}

}
