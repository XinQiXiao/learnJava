package com.unit8_market.pojo;
import java.util.ArrayList;
import java.util.Scanner;

public class Market {
	
	Scanner in=new Scanner(System.in);
	
	//将商品列表作为Market类的属性
	public ArrayList goodsList= new ArrayList();
	
	//显示商品列表
	public void showAllGoods() {
		System.out.println("-编号-------名称--------价格-");
		for(int i=0;i<this.goodsList.size();i++) {
			Good good=(Good)this.goodsList.get(i);
			good.show();
		}
	}
	//上架
	public void addGood() {
		System.out.println("-------------商品上架--------------");
		System.out.println("请输入商品编号：");
		int inputGid=in.nextInt();
		System.out.println("请输入商品名称：");
		String inputName=in.next();
		System.out.println("请输入商品价格：");
		double inputPrice=in.nextDouble();
		int msg=0;
		for(int i=0;i<this.goodsList.size();i++) {
			Good good=(Good)this.goodsList.get(i);
			if(inputGid==good.gid || inputName.equals(good.name)) {
				System.out.println("商品信息重复！");
				msg=1;
			}
		}
		//添加商品
		if(msg==0) {
			Good good=new Good(inputGid,inputName,inputPrice);
			this.goodsList.add(good);
			System.out.println("商品信息添加成功！！");
		}
	}
	
	//下架
	public void delGood() {
		System.out.println("-------------商品下架--------------");
		System.out.println("请输入商品编号：");
		int inputGid=in.nextInt();
		int msg=0;
		for(int i=0;i<this.goodsList.size();i++) {
			Good good=(Good)this.goodsList.get(i);
			if(inputGid==good.gid) {
				this.goodsList.remove(i);//删除找到的当前商品
				System.out.println("商品信息删除成功！！");
				msg=1;
			}
		}
		if(msg==0) {
			System.out.println("没有此商品！");
		}
	}
	
	//修改价格
	public void alterPrice() {
		System.out.println("-------------修改价格--------------");
		System.out.println("请输入商品编号：");
		int inputGid=in.nextInt();
		int msg=0;
		for(int i=0;i<this.goodsList.size();i++) {
			Good good=(Good)this.goodsList.get(i);
			if(inputGid==good.gid) {
				System.out.println("请输入新的商品价格：");
				good.price=in.nextDouble();
				this.goodsList.set(i, good);
				msg=1;
			}
		}
		if(msg==0) {
			System.out.println("没有此商品！");
		}
	}
	
}
