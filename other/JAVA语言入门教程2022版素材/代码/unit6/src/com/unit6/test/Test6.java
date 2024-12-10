package com.unit6.test;

public class Test6 {

	public static void main(String[] args) {
		//3.在一个数组中找出最大和最小值。
		int[] nums= {1,34,456,3,54,65};
		int max=nums[0];//将第一个值作为默认值
		int min=nums[0];
		for(int i=0;i<nums.length;i++){
			if(nums[i]>max) {
				max=nums[i];
			}
			if(nums[i]<min) {
				min=nums[i];
			}
		}
		System.out.println(max+"---"+min);

	}

}
