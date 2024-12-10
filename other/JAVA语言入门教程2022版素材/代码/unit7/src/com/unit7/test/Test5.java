package com.unit7.test;

public class Test5 {
	
	//传入单个参数
	public static void getLevel(int score) {
		if(score>=80) {
			System.out.println("优秀！");
		}else if(score>=60) {
			System.out.println("及格！");
		}else {
			System.out.println("不及格！");
		}
	}
	
	//传入多个参数
	public static void getLevelB(int score,String name,String className) {
		System.out.println("班级："+className+"姓名"+name);
		if(score>=80) {
			System.out.println("优秀！");
		}else if(score>=60) {
			System.out.println("及格！");
		}else {
			System.out.println("不及格！");
		}
	}
	
	//传入数组
	public static void getSum(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		System.out.println("求和结果："+sum);
	}
	

	//main方法
	public static void main(String[] args) {
//		getLevel(96);
//		getLevelB(96,"张三","2班");
		
		int[] arr= {2132,43,456,57678,7,9};
		getSum(arr);

	}

}
