package com.unit6.test;

public class Test7 {

	public static void main(String[] args) {
		//4.����һ��int�������飬������һЩ�������ظ��ģ����ҳ��ظ�����Щ����
		int[] nums= {1,2,3,4,5,6,3,4};
		for(int i=0;i<nums.length;i++) {
			int c=0;//����ĳһ��Ԫ�س��ֵĸ���
			for(int j=0;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					c++;
				}
			}
			System.out.println(nums[i]+"���ֵĴ�����"+c);
			if(c>1) {
				System.out.println(nums[i]+"�ظ�����������������");
			}
		}

	}

}
