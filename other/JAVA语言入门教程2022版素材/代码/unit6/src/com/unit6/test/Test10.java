package com.unit6.test;

public class Test10 {

	public static void main(String[] args) {
		//指定位置增加数据--- 下标3位置添加新元素0-- {1,2,3,0,4,5,6,7}
		int[] oldArray= {1,2,3,4,5,6,7};
		              //{1,2,3,0,4,5,6,7}
		int[] newArray=new int[oldArray.length+1];
		
		for(int i=0;i<=newArray.length-1;i++) {
			if(i<3) {
				newArray[i]=oldArray[i];//直接拷贝
			}else if(i==3) {
				newArray[3]=0;//添加的值
			}else if(i>3) {
				newArray[i]=oldArray[i-1];//拷贝余下数据
			}
		}
		
		for(int x:newArray) {
			System.out.println(x);
		}
		
		

	}
}
