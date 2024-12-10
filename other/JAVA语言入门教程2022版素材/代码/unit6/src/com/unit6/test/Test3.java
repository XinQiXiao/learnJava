package com.unit6.test;

public class Test3 {

	public static void main(String[] args) {
		//                0    1   2    3    4   5
		String[] names= {"张三","李四","王五","大宝","二宝","三宝"};
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
			if("大宝".equals(names[i])) {
				System.out.println("大宝在这个班！");
			}
		}
		
		double[] scores= {67,83,63,75,65};
		double sum=0; 
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
		}
		System.out.println(sum/scores.length);

	}

}
