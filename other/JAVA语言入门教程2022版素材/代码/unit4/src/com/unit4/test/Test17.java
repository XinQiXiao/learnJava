package com.unit4.test;

import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		double maxScore=0;
		double minScore=0;
		double avgScore=0;
		double sumScore=0;
		
		int i=0;//ͳ������
		while(true) {
			//ѭ������ɼ�
			i++;
			System.out.println("�������"+i+"ѧԱ������");
			double score=input.nextInt();
			
			//���
			sumScore+=score;
			
			//��߷ֺ���ͷ�
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
		
			//�����Ƿ��������
			System.out.println("ֹͣ������1�������������������֣�");
			int choice=input.nextInt();
			if(choice==1) {
				break;
			}
		}
		avgScore=sumScore/i;
		System.out.println("��߷֣�"+maxScore);
		System.out.println("��ͷ֣�"+minScore);
		System.out.println("�ܷ֣�"+sumScore);
		System.out.println("ƽ���֣�"+avgScore);

	}

}
