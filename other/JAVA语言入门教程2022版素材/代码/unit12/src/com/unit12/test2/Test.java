package com.unit12.test2;

public class Test {

	public static void main(String[] args) {
		int[] array= {2,13,2435,465,6,4,23,23,0,54,56,823,5,4576,87};
		for(int i:array) {
			
			try {
				//编写可能会出现异常的代码
				System.out.println("------------"+(10/i));
			}catch(Exception e) {
				//编写出现异常后执行的代码   
				System.out.println("发生异常：");
				e.printStackTrace();//e.printStackTrace() 打印异常信息
			}finally {
				//无论是否发生异常，都会执行的代码    
				System.out.println("执行一次循环!");
			}
			
		}
	}

}
