package com.unit6.test;

public class Test13 {

	public static void main(String[] args) {
		String[][] array= {{"a","b","c"},{"d","e","f"},{"h","i","j","k","l","m"}};
		//System.out.println(array[3][2]);
		
		
		//ͨ��forѭ��������ά����
//		for(int i=0;i<array.length;i++) {
//			for(int j=0;j<array[i].length;j++) {
//				System.out.println(array[i][j]);
//			}
//		}
		
		
		//ͨ��for-eachѭ��������ά����
		for(String[] innerArray:array) {
			for(String s:innerArray) {
				System.out.println(s);
			}
		}
		
		//��ȡ��������
		System.out.println(array.getClass());
		
	}
}
