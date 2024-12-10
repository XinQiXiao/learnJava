package com.unit5.test;

import java.util.Scanner;

public class Test3 {
	/*
	 开发一个超市管理系统，进行超市中商品、订单、员工的系统化管理。
	实现内容：
	1.用户登录，登录成功进入主功能菜单，登录失败则重新登录；
	2.主菜单中，根据用户选择，进入子功能菜单（具体业务暂不实现）；
	3.实现主菜单和子菜单的来回切换。
	
	51超市管理系统有以下功能：
	收银台、商品管理、订单管理、会员库、员工管理
	商品管理包含：商品列表、商品上架、商品下架、商品编辑
	订单管理包含：订单列表、删除订单
	会员库的包含：查看会员、编辑会员信息
	员工管理中的包含：查看所有员工、入职、离职、信息编辑	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("*****************51超市管理系统 1.0********************");
		//用户登录
		boolean msg=false;//false--失败  true---成功
		while(true) {
			System.out.println("请输入用户名：");
			String uname=input.next();
			System.out.println("请输入用户密码：");
			String upwd=input.next();
			
			if("zhangsan".equals(uname)&&"12345".equals(upwd)) {
				System.out.println("恭喜你！登录成功！");
				msg=true;
				break;
			}else {
				System.out.println("登录失败！请重新登录！");
				continue;
			}
		}
		//登录成功时，进入菜单
		if(msg) {
			while(true) {
				System.out.println("------------------主菜单-----------------");
				System.out.println("-1.收银台；");
				System.out.println("-2.商品管理；");
				System.out.println("-3.订单管理；");
				System.out.println("-4.会员库；");
				System.out.println("-5.员工管理；");
				System.out.println("-6.退出程序；");
				System.out.println("-----------------------------------");
				System.out.println("-请输入功能编号：");
				int c1=input.nextInt();
				if(c1==1) {
					System.out.println("收银中.....");
				}else if(c1==2) {
					while(true) {
						System.out.println("------------------商品管理-----------------");
						System.out.println("-1.显示所有商品；");
						System.out.println("-2.上架商品；");
						System.out.println("-3.下架商品；");
						System.out.println("-4.商品信息修改；");
						System.out.println("-5.退出；");
						System.out.println("-----------------------------------");
						System.out.println("-请输入功能编号：");
						int c11=input.nextInt();
						if(c11==5) {
							break;
						}
					}
				}else if(c1==3) {
					while(true) {
						System.out.println("------------------订单管理-----------------");
						System.out.println("-1.显示所有商品；");
						System.out.println("-2.上架商品；");
						System.out.println("-3.下架商品；");
						System.out.println("-4.商品信息修改；");
						System.out.println("-5.退出；");
						System.out.println("-----------------------------------");
						System.out.println("-请输入功能编号：");
						int c11=input.nextInt();
						if(c11==5) {
							break;
						}
					}
				}else if(c1==4) {
					while(true) {
						System.out.println("------------------会员库-----------------");
						System.out.println("-1.显示所有商品；");
						System.out.println("-2.上架商品；");
						System.out.println("-3.下架商品；");
						System.out.println("-4.商品信息修改；");
						System.out.println("-5.退出；");
						System.out.println("-----------------------------------");
						System.out.println("-请输入功能编号：");
						int c11=input.nextInt();
						if(c11==5) {
							break;
						}
					}
				}else if(c1==5) {
					while(true) {
						System.out.println("------------------员工管理-----------------");
						System.out.println("-1.显示所有商品；");
						System.out.println("-2.上架商品；");
						System.out.println("-3.下架商品；");
						System.out.println("-4.商品信息修改；");
						System.out.println("-5.退出；");
						System.out.println("-----------------------------------");
						System.out.println("-请输入功能编号：");
						int c11=input.nextInt();
						if(c11==5) {
							break;
						}
					}
				}else if(c1==6) {
					System.out.println("正在退出....");
					break;
				}else {
					System.out.println("没有此功能，请重新选择！");
					continue;
				}
				
			}
		}
		
		

	}

}
