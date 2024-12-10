package com.unit7.test;

import java.util.Random;

public class Test10 {
	//直接在类中声明的静态变量，在整个类中可以直接访问
	static Random rand=new Random();
	//玩家摇色子
	public static int playerPoint() {
		System.out.println("玩家开始摇色子......");
		int p1=rand.nextInt(6)+1;
		return p1;
	}
	//电脑摇色子
	public static int computerPoint() {
		System.out.println("电脑开始摇色子......");
		int p2=rand.nextInt(6)+1;
		return p2;
	}
	//游戏开始
	public static void start() {
		int count1=0;
		int count2=0;
		for(int i=1;i<=3;i++) {
			System.out.println("-----------------第"+i+"局！");
			int point1=computerPoint();
			System.out.println("电脑的点数是："+point1);
			int point2=playerPoint();
			System.out.println("你的点数是："+point2);
			if(point1>point2) {
				System.out.println("电脑赢下一局！");
				count1++;
			}else if(point1<point2) {
				System.out.println("你赢下一局！");
				count2++;
			}else {
				System.out.println("平局！");
			}
		}
		if(count1>count2) {
			System.out.println("------------很遗憾，你输了！");
		}else if(count1<count2){
			System.out.println("------------恭喜，你赢了！");
		}else {
			System.out.println("------------平了！");
		}
	}

	//---------------------
	public static void main(String[] args) {
		start();
	}

}
