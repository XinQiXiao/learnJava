package com.unit7.test;

import java.util.Random;

public class Test10 {
	//ֱ�������������ľ�̬���������������п���ֱ�ӷ���
	static Random rand=new Random();
	//���ҡɫ��
	public static int playerPoint() {
		System.out.println("��ҿ�ʼҡɫ��......");
		int p1=rand.nextInt(6)+1;
		return p1;
	}
	//����ҡɫ��
	public static int computerPoint() {
		System.out.println("���Կ�ʼҡɫ��......");
		int p2=rand.nextInt(6)+1;
		return p2;
	}
	//��Ϸ��ʼ
	public static void start() {
		int count1=0;
		int count2=0;
		for(int i=1;i<=3;i++) {
			System.out.println("-----------------��"+i+"�֣�");
			int point1=computerPoint();
			System.out.println("���Եĵ����ǣ�"+point1);
			int point2=playerPoint();
			System.out.println("��ĵ����ǣ�"+point2);
			if(point1>point2) {
				System.out.println("����Ӯ��һ�֣�");
				count1++;
			}else if(point1<point2) {
				System.out.println("��Ӯ��һ�֣�");
				count2++;
			}else {
				System.out.println("ƽ�֣�");
			}
		}
		if(count1>count2) {
			System.out.println("------------���ź��������ˣ�");
		}else if(count1<count2){
			System.out.println("------------��ϲ����Ӯ�ˣ�");
		}else {
			System.out.println("------------ƽ�ˣ�");
		}
	}

	//---------------------
	public static void main(String[] args) {
		start();
	}

}
