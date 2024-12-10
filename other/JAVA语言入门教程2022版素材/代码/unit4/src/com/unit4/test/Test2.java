package com.unit4.test;

public class Test2 {

	public static void main(String[] args) {
		int year=1;
		while(year<=10) {
			//在循环结构中嵌套选择结构
			if(year==7) {
				System.out.println("*****第七年还清了所有贷款");
				year=11;//改变循环条件，提前停止循环
			}else {
			System.out.println("第"+year+"年，还款1.2万元！");
			year++;
			}
		}

	}

}
