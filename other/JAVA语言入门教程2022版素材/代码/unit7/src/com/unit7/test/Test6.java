package com.unit7.test;

public class Test6 {
	//返回值
	
	//返回求和结果
	public static int getSum(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		return sum; //返回数据，必须写在方法执行的末尾
	}
	
	//---------------------
	public static void main(String[] args) {
		int[] arr= {13,2,54,6,768,9,89};
		int result=getSum(arr);//执行方法并获取返回结果
		System.out.println("求和结果："+result);
	}

}
