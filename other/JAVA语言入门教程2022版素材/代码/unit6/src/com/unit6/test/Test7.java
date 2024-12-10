package com.unit6.test;

public class Test7 {

	public static void main(String[] args) {
		//4.定义一组int类型数组，里面有一些数据是重复的，请找出重复的这些数。
		int[] nums= {1,2,3,4,5,6,3,4};
		for(int i=0;i<nums.length;i++) {
			int c=0;//保存某一个元素出现的个数
			for(int j=0;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					c++;
				}
			}
			System.out.println(nums[i]+"出现的次数："+c);
			if(c>1) {
				System.out.println(nums[i]+"重复！！！！！！！！");
			}
		}

	}

}
