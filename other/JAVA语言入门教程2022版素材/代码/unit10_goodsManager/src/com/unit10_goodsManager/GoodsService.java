package com.unit10_goodsManager;

import java.util.ArrayList;
import java.util.Scanner;

//编写Goods类相关业务方法
public class GoodsService {
	
	GoodsDAO goodsDAO=new GoodsDAO();
	
	//显示商品列表
	public void showAllGoods() {
		String sql="select * from goods;";
		ArrayList<Goods> goodsList=goodsDAO.getDataBySql(sql);
		System.out.println("-----------商品列表-----------");
		for(Goods good:goodsList) {
			System.out.println(good.getId()+"   "+good.getName()+"   "+good.getPrice());
		}
		System.out.println("---------------------------");
	} 
	
	//商品上架
	public void addGoods() {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入增加的商品名称：");
		String name=s.next();
		System.out.println("请输入增加的商品价格：");
		double price=s.nextDouble();
		String sql="insert into goods(name,price) values('"+name+"',"+price+");";
		boolean result=goodsDAO.setDataBySql(sql);
		if (result) {
			System.out.println("-----添加成功！");
		}else {
			System.out.println("------添加失败！");
		}
	}
	
	//商品下架
	public void delGood() {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入要删除的商品id：");
		int id=s.nextInt();
		
		String sql="delete from goods where id="+id+";";
		boolean result=goodsDAO.setDataBySql(sql);
		if (result) {
			System.out.println("-----删除成功！");
		}else {
			System.out.println("------删除失败！");
		}
	}
	
	//商品价格修改
	public void setPrice() {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入要修改的商品id：");
		int id=s.nextInt();
		System.out.println("请输新的价格：");
		double newPrice=s.nextDouble();
		String sql="update goods set price="+newPrice+" where id="+id+";";
		boolean result=goodsDAO.setDataBySql(sql);
		if (result) {
			System.out.println("-----修改成功！");
		}else {
			System.out.println("------修改失败！");
		}
	}
}
