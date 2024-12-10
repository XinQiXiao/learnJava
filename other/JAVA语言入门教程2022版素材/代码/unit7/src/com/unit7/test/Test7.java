package com.unit7.test;

public class Test7 {
	/*
	 1.编写登录方法，接收用户名或者密码，
	返回”成功”或者”失败”！。

    2.写方法，接收3个数字参数，返回最大的那个数字。

    3.榨汁机：用户输入水果名称，返回对应果汁。

	 */
	
	public static int getMax(int a,int b,int c) {
		int[] nums= {a,b,c};
		int max=nums[0];
		for(int i:nums) {
			if(i>max) {
				max=i;
			}
		}
		return max;
	}
	
	public static String login(String name,String pwd) {
		String result1="失败";
		if("zhangsan".equals(name)&&"123abc".equals(pwd)) {
			result1="成功";
		}
		return result1;
	}

	
	//---------------------
	public static void main(String[] args) {
//		String r1=login("zhangsan","123abc");
//		System.out.println(r1);
		
		int r2=getMax(123,34,45);
		System.out.println(r2);
	}

}
