package com.unit4.test;

public class Test8 {

	public static void main(String[] args) {
		
		double p=0.08;
		double m=8844000;
		int t=0;//保存对折次数
		
		//当纸的厚度小于珠峰高度时，循环对折，直到达到珠峰高度
		while(p<m) {
			p=p*2;//对折
			t++;
			System.out.println("第"+t+"次对折，当前纸的高度："+p);
		}
		System.out.println("------"+t);

	}

}
