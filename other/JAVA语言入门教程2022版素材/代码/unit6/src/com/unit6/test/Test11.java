package com.unit6.test;

import java.util.Arrays;

public class Test11 {

	public static void main(String[] args) {
		//删除元素  将元素4去掉
		int[] oldArray= {1,2,3,4,5,6,7};
		              //{1,2,3,5,6,7}
		int[] newArray=new int[oldArray.length-1];
		
		for(int i=0;i<=newArray.length-1;i++) {
			if(i<3) {
				newArray[i]=oldArray[i];
			}else if(i>=3) {
				newArray[i]=oldArray[i+1];
			}
		}
		for(int x:newArray) {
			System.out.println(x);
		}
		

	}
}
