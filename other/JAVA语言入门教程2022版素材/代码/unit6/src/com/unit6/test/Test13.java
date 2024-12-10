package com.unit6.test;

public class Test13 {

	public static void main(String[] args) {
		String[][] array= {{"a","b","c"},{"d","e","f"},{"h","i","j","k","l","m"}};
		//System.out.println(array[3][2]);
		
		
		//通过for循环遍历二维数组
//		for(int i=0;i<array.length;i++) {
//			for(int j=0;j<array[i].length;j++) {
//				System.out.println(array[i][j]);
//			}
//		}
		
		
		//通过for-each循环遍历二维数组
		for(String[] innerArray:array) {
			for(String s:innerArray) {
				System.out.println(s);
			}
		}
		
		//获取数组类型
		System.out.println(array.getClass());
		
	}
}
