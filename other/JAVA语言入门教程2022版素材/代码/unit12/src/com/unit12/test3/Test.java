package com.unit12.test3;

public class Test {
	
	public static void method(int i) throws Exception{
		//编写可能会出现异常的代码
		System.out.println("------------100除以"+i+",结果："+(100/i));
	}

	public static void main(String[] args) throws Exception {
		int[] array= {2,13,2435,465,6,4,23,23,0,54,56,823,5,4576,87};
		
//		for(int i:array) {		
//			try {
//				method(i);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
		
		for(int i:array) {
			method(i);
		}
	}

}
