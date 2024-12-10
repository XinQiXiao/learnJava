package com.unit4.test;

public class Test15 {

	public static void main(String[] args) {
		//无限循环适合不知道循环次数，也不明确循环停止条件的循环
//		int i=1;
//		while(true) {  
//			i++;
//			System.out.println("第"+i+"次打印：你好！世界！");
//		}
		
		
		for(int i=1;;i++){
			System.out.println("第"+i+"次打印：你好！世界！");
		}

	}

}
