package com.unit11_Market.service;
import java.util.ArrayList;
import java.util.Scanner;

import com.unit11_Market.DAO.GoodDAO;
import com.unit11_Market.DAO.OrderDAO;
import com.unit11_Market.pojo.Good;
import com.unit11_Market.pojo.Order;
import com.unit11_Market.util.DatetimeUtil;

public class OrderService {
	OrderDAO orderDAO=new OrderDAO();
	GoodDAO goodDAO=new GoodDAO();
	Scanner s=new Scanner(System.in);
	GoodService goodService=new GoodService();
	
	//查询订单列表
	public void getAllOrders() {
		String sql="select * from orders;";
		ArrayList<Order> ordersList=orderDAO.getDataBySql(sql);
		System.out.println("---------------------订单列表---------------------");
		for(Order order:ordersList) {
			System.out.println(order.getId()+"    "+order.getCount()+"    "+
			order.getAmount()+"    "+order.getTime());
		}
		System.out.println("---------------------------------------------");
	}
	
	//添加订单
	public boolean addOrder(Order order) {
		String sql="insert into orders(count,amount,time) values("+order.getCount()+","+order.getAmount()+",'"+order.getTime()+"');";
		//System.out.println("执行的sql:"+sql);
		boolean result=orderDAO.setDataBySql(sql);
		if(result) {
			System.out.println("-----订单已添加！");
		}else {
			System.out.println("-----订单添加失败！");
		}
		return result;
	}
	
	//删除订单
	public void delOrder() {
		System.out.println("---------------------删除订单---------------------");
		Scanner s=new Scanner(System.in);
		System.out.println("请输入要删除的订单号：");
		int id=s.nextInt();
		
		String sql="delete from orders where id="+id+";";
		boolean result=goodDAO.setDataBySql(sql);
		if (result) {
			System.out.println("-----删除成功！");
		}else {
			System.out.println("------删除失败！");
		}
	}
	
	//收银台
	public void cashier() {
		int totalCount=0;//总数量
		double totalAmount=0;//总金额
		System.out.println("---------------------收银台---------------------");
		while(true) {
			System.out.println("请输入添加商品的编号：");
			int id=s.nextInt();
			System.out.println("请输入商品数量：");
			int count=s.nextInt();
			String sql="select * from goods where id="+id+";";
			ArrayList<Good> goodsList=goodDAO.getDataBySql(sql);
			if(goodsList.size()==0) {
				System.out.println("商品不存在，请重新添加！");
				continue;
			}else{
				Good good=goodsList.get(0);//获取查询到的商品信息
				goodService.addAndMinusStock(good, count*-1);//减库存
				System.out.println("----您购买的是："+good.getName()+"，单价："+good.getPrice()+"元！");
				double amount=count*good.getPrice();//单个商品金额
				totalAmount+=amount;
				totalCount+=count;
				System.out.println("输入----1.继续添加    2.结算   3.取消：");
				int c=s.nextInt();
				if(c==1) {
					continue;
				}else if(c==2) {
					Order o=new Order();//新建订单
					o.setAmount(totalAmount);
					o.setCount(totalCount);
					o.setTime(DatetimeUtil.getNow());
					boolean result=addOrder(o);//添加订单
					System.out.println("------------------------------------------");
					if(!result) {
						totalAmount=0;
						totalCount=0;
						continue;	
					}else {
						System.out.println("----您当前订单商品数量："+totalCount+",总金额："+totalAmount+"元！");
					}
					break;
				}else {
					totalAmount=0;
					totalCount=0;
					System.out.println("------------------------------------------");
					continue;
				}			
			}
		}
	}
	
	
}
