package com.unit7.test;

public class Test4 {
	//参数                     参数列表:形参
	public static void methodA(String s) {
		System.out.println("methodA被执行！");
		System.out.println("用户传入的参数："+s);
	}
	
	
	//main方法
	public static void main(String[] args) {
		//调用方法时传入 实参     
		methodA("西瓜");
		String a="菠萝";
		methodA(a);
		//实参的数据类型和数量必须和形参一致
	}

}
