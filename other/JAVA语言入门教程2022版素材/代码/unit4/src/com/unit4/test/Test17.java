package com.unit4.test;

import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		double maxScore=0;
		double minScore=0;
		double avgScore=0;
		double sumScore=0;
		
		int i=0;//统计人数
		while(true) {
			//循环输入成绩
			i++;
			System.out.println("请输入第"+i+"学员分数：");
			double score=input.nextInt();
			
			//求和
			sumScore+=score;
			
			//最高分和最低分
			if(i==1) {
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
		
			//控制是否继续输入
			System.out.println("停止请输入1，继续请输入其他数字：");
			int choice=input.nextInt();
			if(choice==1) {
				break;
			}
		}
		avgScore=sumScore/i;
		System.out.println("最高分："+maxScore);
		System.out.println("最低分："+minScore);
		System.out.println("总分："+sumScore);
		System.out.println("平均分："+avgScore);

	}

}
