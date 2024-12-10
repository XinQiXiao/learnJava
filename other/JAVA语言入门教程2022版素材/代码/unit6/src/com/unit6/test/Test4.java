package com.unit6.test;

public class Test4 {

	public static void main(String[] args) {
		//1.顺序查找：给定一个数组, 再给定一个元素, 找出该元素在数组中的位置。
		
		String[] names= {"张三","李四","王五","大宝","二宝","三宝"};
		for(int i=0;i<names.length;i++) {
			if("二宝".equals(names[i])) {
				System.out.println(names[i]+"的位置（下标）是:"+i);
			}
		}

	}

}
