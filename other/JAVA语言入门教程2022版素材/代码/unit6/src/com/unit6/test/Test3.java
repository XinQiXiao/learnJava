package com.unit6.test;

public class Test3 {

	public static void main(String[] args) {
		//                0    1   2    3    4   5
		String[] names= {"����","����","����","��","����","����"};
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
			if("��".equals(names[i])) {
				System.out.println("��������࣡");
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
