package com.unit2.test;

public class Test7 {

	public static void main(String[] args) {
		//算术运算符
		int a1=10;
		double a2=3.14;
		//System.out.println((a1+2-3)*6);
		//整数和整数相除，需要将其中一个数强制转换浮点型，才能获取小数部分的结果
		//System.out.println(a1/(double)3);
		//System.out.println(a2%1);//获取余数（模）
		a1++; //将a1自加1  a1=a1+1
		a2--;
		//System.out.println(a2);
		
		
		//赋值运算符
		int b1=6;  //将右边的值赋给左边的变量
		int b2=b1-3;
		b1+=5;  // b1=b1+5
		//System.out.println(b1);
		
		
		//关系运算符    运算的结果是boolean
		int c1=7;
		int c2=7;
		//System.out.println(c1==c2);
		//System.out.println(c1!=c2);
		//System.out.println(c1>=c2);
		//System.out.println(c1<=c2);
		
		
		//逻辑运算符  运算的结果是boolean,和关系运算符配合使用
		int d1=8;
		int d2=6;
//		System.out.println(d1<10 && d2>=5);
//		System.out.println(d1<3 || d2>=9);
//		System.out.println(!(d1>3));
		
		
		//三元运算符(三目运算符)
		int age=39;
		String s=age<=30?"青年":"中年";
		System.out.println(s);

	}

}
