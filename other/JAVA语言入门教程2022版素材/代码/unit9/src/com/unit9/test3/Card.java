package com.unit9.test3;

import java.util.Scanner;

public class Card {
	
	Scanner in=new Scanner(System.in);
	private String cid;
	private String cpwd;
	private double cbalance;
	
	public Card(String cid, String cpwd, double cbalance) {
		this.cid = cid;
		this.cpwd = cpwd;
		this.cbalance = cbalance;
	};
	
	
	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		if(cid.length()==19) {
			this.cid = cid;
		}else {
			System.out.println("卡号必须为19位！");
		}
		
	}

	public void getCpwd() {
		System.out.println("密码不允许访问！");
	}

	public void setCpwd(String cpwd) {
		if(cid.length()==6) {
			this.cpwd = cpwd;
		}else {
			System.out.println("密码必须为6位！");
		}
	}

	public double getCbalance(String pwd) {
		double b=0;
		if(pwd.equals(this.cpwd)) {
			b = this.cbalance;
		}else {
			System.out.println("密码错误！");
		}
		return b;
	}

	public void setCbalance(double cbalance) {
		if(cbalance>0) {
			this.cbalance = cbalance;
		}else {
			System.out.println("余额必须大于0！");
		}
	}

	//奖励
	private void reward() {
		System.out.println("恭喜你获得存款奖励：现金1000元！");
	}

	//查询余额
	public void show() {
		System.out.println("卡号："+this.cid+"，您的余额是"+this.cbalance+"元！");
	}
	
	//存款
	public void deposit() {
		System.out.println("请输入存款金额：");
		double amount=in.nextDouble();
		if(amount<=0) {
			System.out.println("存款金额必须大于0！");
		}else {
			if(amount>=100000) {
				this.reward();
			}
			this.cbalance+=amount;
			System.out.println("存入"+amount+"元！余额"+this.cbalance+"元！");
		}
	}
	//取款
	public void draw() {
		System.out.println("请输入取款金额：");
		double amount=in.nextDouble();
		if(amount>this.cbalance) {
			System.out.println("余额不足！");
		}else {
			this.cbalance-=amount;
			System.out.println("取出"+amount+"元！余额"+this.cbalance+"元！");
		}
	}
	//修改密码
	public void alterPassword() {
		System.out.println("请输入原密码：");
		String pwd=in.next();
		if(pwd.equals(this.cpwd)) {
			System.out.println("原密码验证成功，请输入新密码：");
			String newPwd=in.next();
			this.cpwd=newPwd;
		}else {
			System.out.println("原密码验证失败！");
		}
	}

}
