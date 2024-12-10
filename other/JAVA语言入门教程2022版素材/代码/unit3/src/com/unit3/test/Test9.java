package com.unit3.test;

public class Test9 {

	public static void main(String[] args) {
		int level=10;
		
		switch(level) {
			case 0:
				System.out.println("非会员！谢谢惠顾！");
				break;
			case 1:
				System.out.println("打99折！谢谢惠顾！");
				break;
			case 2:
				System.out.println("打95折！谢谢惠顾！");
				break;
			case 3:
				System.out.println("打9折！谢谢惠顾！");
				break;
			case 4:
				System.out.println("打85折！谢谢惠顾！");
				break;
			case 5:
				System.out.println("打8折！谢谢惠顾！");
				break;
			default:
				System.out.println("没有此会员等级！");
				break;
		}
		//default可以省略，编写在末尾；case可以有多个
		//case后面必须常量；break不可省略

	}

}
