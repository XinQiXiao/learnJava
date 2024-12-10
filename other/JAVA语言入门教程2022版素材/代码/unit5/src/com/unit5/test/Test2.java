package com.unit5.test;
import java.util.Scanner;
/*
模拟银行ATM存款存取款的相关功能，具体内容：
1.模拟3张银行卡,1001,1002,1003,分别设置密码和余额(可以用9个变量分别保存卡号.密码和余额)；
2.提示用户输入银行卡和密码；
3.如果用户输入正确---提示让用户选择取款.存款还是退出,并提示余额多少；       输入错误---重新输入卡号密码；
4.选择取款---提示输入取款额度,如果超过余额,提示余额不足;否则,在余额上减掉相应金额;
5.选择存款---输入存款额度,余额加上相应额度,并提示余额多少;
6.选择退出---退卡
7.限制3次输入错误账号密码,提示银行卡已被锁定
*/
public class Test2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String cid1="1001";
		String cpassword1="123";
		double cbalance1=1000;
		
		String cid2="1002";
		String cpassword2="123";
		double cbalance2=2000;
		
		String cid3="1003";
		String cpassword3="123";
		double cbalance3=3000;
		
		int count=0; //连续输入错误的次数
		while(true) {
			//登录
			double balance=0;//保存要处理的余额信息
			System.out.println("请输入卡号：");
			String id=input.next();
			System.out.println("请输入密码：");
			String pwd=input.next();
			if(cid1.equals(id)&&cpassword1.equals(pwd)) {
				balance=cbalance1;
				count=0;//输入正确，错误次数清零
			}else if(cid2.equals(id)&&cpassword2.equals(pwd)) {
				balance=cbalance2;
				count=0;//输入正确，错误次数清零
			}else if(cid3.equals(id)&&cpassword3.equals(pwd)) {
				balance=cbalance3;
				count=0;//输入正确，错误次数清零
			}else {
				count++;//错误次数+1
				if(count==3) {
					System.out.println("您已经连续3次输入错误，银行卡已被锁定！");
					break;//锁定后，终止整个登录的循环
				}else {
					System.out.println("您已经连续"+count+"次输入错误！还有"+(3-count)+"次机会！");
					continue;
				}
			}
			
			//具体业务
			while(true) {
				System.out.println("您的余额"+balance+"元，请输入要办理的业务编号（1.存款 2.取款 3.退卡）：");
				int c=input.nextInt();
				if(c==1) {
					//控制存款业务
					while(true) {
						System.out.println("请输入存款金额：");
						double money1=input.nextDouble();
						if(money1<=0) {
							System.out.println("存款金额必须大于0，请重新输入！");
							continue;
						}else {
							balance+=money1;//存款
							System.out.println("-------存款"+money1+"元！余额"+balance+"元！");
							break;
						}
					}
				}else if(c==2){
					//控制取款业务
					while(true) {
						System.out.println("请输入取款金额：");
						double money2=input.nextDouble();
						if(money2>balance) {
							System.out.println("余额不足，请重新输入！");
							continue;
						}else {
							balance-=money2;//取款
							System.out.println("-------取款"+money2+"元！余额"+balance+"元！");
							break;
						}
					}
				}else if(c==3){
					break;//退出具体业务循环，重新输入卡号密码
				}else {
					System.out.println("没有此业务，请重新选择！");
					continue;
				}
			}
		}
		
	}
}
