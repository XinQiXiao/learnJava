package com.unit4.test;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		double maxScore=0;
		double minScore=0;
		double sumScore=0;
		double avgScore=0;
		
		int i=1;
		while(i<=10) {
			System.out.println("�������"+i+"��������");
			double score=input.nextDouble();
			sumScore+=score;
			if(i==1){
				maxScore=score;
				minScore=score;
			}else {
				if(score>maxScore) {
					maxScore=score;
				}
				if(score<minScore) {
					minScore=score;
				}
			}
			i++;
		}
		avgScore=sumScore/10;
		System.out.println("��߷֣�"+maxScore);
		System.out.println("��ͷ֣�"+minScore);
		System.out.println("�ܷ֣�"+sumScore);
		System.out.println("ƽ���֣�"+avgScore);

	}

}
