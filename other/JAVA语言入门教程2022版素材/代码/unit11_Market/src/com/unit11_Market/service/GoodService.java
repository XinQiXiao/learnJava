package com.unit11_Market.service;

import java.util.ArrayList;
import java.util.Scanner;
import com.unit11_Market.DAO.GoodDAO;
import com.unit11_Market.pojo.Good;

//编写Goods类相关业务方法
public class GoodService {
	
	GoodDAO goodDAO=new GoodDAO();
	
	//显示商品列表
	public void showAllGoods() {
		String sql="select * from goods;";
		ArrayList<Good> goodsList=goodDAO.getDataBySql(sql);
		System.out.println("---------------------显示商品列表---------------------");
		for(Good good:goodsList) {
			System.out.println(good.getId()+"   "+good.getName()+"   "+good.getPrice()+"   "+good.getStock());
		}
		System.out.println("---------------------------");
	} 
	
	//商品上架
	public void addGoods() {
		System.out.println("---------------------商品上架---------------------");
		Scanner s=new Scanner(System.in);
		System.out.println("请输入增加的商品名称：");
		String name=s.next();
		System.out.println("请输入增加的商品价格：");
		double price=s.nextDouble();
		String sql="insert into goods(name,price) values('"+name+"',"+price+");";
		boolean result=goodDAO.setDataBySql(sql);
		if (result) {
			System.out.println("-----添加成功！");
		}else {
			System.out.println("------添加失败！");
		}
	}
	
	//商品下架
	public void delGood() {
		System.out.println("---------------------商品下架---------------------");
		Scanner s=new Scanner(System.in);
		System.out.println("请输入要删除的商品id：");
		int id=s.nextInt();
		
		String sql="delete from goods where id="+id+";";
		boolean result=goodDAO.setDataBySql(sql);
		if (result) {
			System.out.println("-----删除成功！");
		}else {
			System.out.println("------删除失败！");
		}
	}
	
	//商品价格修改
	public void setPrice() {
		System.out.println("---------------------修改价格---------------------");
		Scanner s=new Scanner(System.in);
		System.out.println("请输入要修改的商品id：");
		int id=s.nextInt();
		System.out.println("请输新的价格：");
		double newPrice=s.nextDouble();
		String sql="update goods set price="+newPrice+" where id="+id+";";
		boolean result=goodDAO.setDataBySql(sql);
		if (result) {
			System.out.println("-----修改成功！");
		}else {
			System.out.println("------修改失败！");
		}
	}
	
	//设置库存
	public void setStock() {
		System.out.println("---------------------库存设置---------------------");
		Scanner s=new Scanner(System.in);
		System.out.println("请输入要修改的商品id：");
		int id=s.nextInt();
		System.out.println("请输新的库存：");
		int stock=s.nextInt();
		if(stock>=0) {
			String sql="update goods set stock="+stock+" where id="+id+";";
			boolean result=goodDAO.setDataBySql(sql);
			if (result) {
				System.out.println("-----库存设置成功！");
			}else {
				System.out.println("------库存设置失败！");
			}
		}else {
			System.out.println("-----设置的库存不可以小于0！");
		}
		
	}
	
	//增减库存
	public boolean addAndMinusStock(Good good,int num) {
		boolean result=false;
		if(num+good.getStock()>=0) {
			String sql="update goods set stock="+(num+good.getStock())+" where id="+good.getId()+";";
			result=goodDAO.setDataBySql(sql);
		}else {
			System.out.println("-----设置的库存不可以小于0！");
		}
		return result;	
	}
}
