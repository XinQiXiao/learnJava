package com.unit7.test;

public class Test7 {
	/*
	 1.��д��¼�����������û����������룬
	���ء��ɹ������ߡ�ʧ�ܡ�����

    2.д����������3�����ֲ��������������Ǹ����֡�

    3.ե֭�����û�����ˮ�����ƣ����ض�Ӧ��֭��

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
		String result1="ʧ��";
		if("zhangsan".equals(name)&&"123abc".equals(pwd)) {
			result1="�ɹ�";
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
