package com.unit7.test;

public class Test8 {

	//榨汁机：用户输入水果名称，返回对应果汁。
	public static String juicer(String f1,String f2) {
		String juice="";
		System.out.println("榨汁机开始工作......");
		juice=f1+f2+"汁";
		return juice;
	}
	
	
	//---------------------
	public static void main(String[] args) {
		String cup=juicer("香蕉","布丁");
		System.out.println("榨出了一杯："+cup);
	}

}
