package com.unit6.test;

public class Test6 {

	public static void main(String[] args) {
		//3.��һ���������ҳ�������Сֵ��
		int[] nums= {1,34,456,3,54,65};
		int max=nums[0];//����һ��ֵ��ΪĬ��ֵ
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
