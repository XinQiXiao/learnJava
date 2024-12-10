package com.unit8_market.pojo;

public class Good {
	public int gid;
	public String name;
	public double price;
	
	public Good(int gid, String name, double price) {
		this.gid = gid;
		this.name = name;
		this.price = price;
	}
	//查看单个商品信息
	public void show() {
		System.out.println(this.gid+"------"+this.name+"------"+this.price);
	}
}
