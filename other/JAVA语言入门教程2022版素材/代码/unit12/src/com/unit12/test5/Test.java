package com.unit12.test5;

public class Test {
	
	public static void main(String[] args) throws Exception {
		//初始资金1万元，年化收益50%，50年后我有多少钱？
		double money=1;
		for(int year=1;year<=30;year++) {
			money=money*1.5;
		}
		System.out.println("30年后，我的钱为"+money+"万元！");
		//断点：程序执行到这一行开始debug
	}
}
