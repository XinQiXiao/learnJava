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
	
	//��ѯ�����б�
	public void getAllOrders() {
		String sql="select * from orders;";
		ArrayList<Order> ordersList=orderDAO.getDataBySql(sql);
		System.out.println("---------------------�����б�---------------------");
		for(Order order:ordersList) {
			System.out.println(order.getId()+"    "+order.getCount()+"    "+
			order.getAmount()+"    "+order.getTime());
		}
		System.out.println("---------------------------------------------");
	}
	
	//��Ӷ���
	public boolean addOrder(Order order) {
		String sql="insert into orders(count,amount,time) values("+order.getCount()+","+order.getAmount()+",'"+order.getTime()+"');";
		//System.out.println("ִ�е�sql:"+sql);
		boolean result=orderDAO.setDataBySql(sql);
		if(result) {
			System.out.println("-----��������ӣ�");
		}else {
			System.out.println("-----�������ʧ�ܣ�");
		}
		return result;
	}
	
	//ɾ������
	public void delOrder() {
		System.out.println("---------------------ɾ������---------------------");
		Scanner s=new Scanner(System.in);
		System.out.println("������Ҫɾ���Ķ����ţ�");
		int id=s.nextInt();
		
		String sql="delete from orders where id="+id+";";
		boolean result=goodDAO.setDataBySql(sql);
		if (result) {
			System.out.println("-----ɾ���ɹ���");
		}else {
			System.out.println("------ɾ��ʧ�ܣ�");
		}
	}
	
	//����̨
	public void cashier() {
		int totalCount=0;//������
		double totalAmount=0;//�ܽ��
		System.out.println("---------------------����̨---------------------");
		while(true) {
			System.out.println("�����������Ʒ�ı�ţ�");
			int id=s.nextInt();
			System.out.println("��������Ʒ������");
			int count=s.nextInt();
			String sql="select * from goods where id="+id+";";
			ArrayList<Good> goodsList=goodDAO.getDataBySql(sql);
			if(goodsList.size()==0) {
				System.out.println("��Ʒ�����ڣ���������ӣ�");
				continue;
			}else{
				Good good=goodsList.get(0);//��ȡ��ѯ������Ʒ��Ϣ
				goodService.addAndMinusStock(good, count*-1);//�����
				System.out.println("----��������ǣ�"+good.getName()+"�����ۣ�"+good.getPrice()+"Ԫ��");
				double amount=count*good.getPrice();//������Ʒ���
				totalAmount+=amount;
				totalCount+=count;
				System.out.println("����----1.�������    2.����   3.ȡ����");
				int c=s.nextInt();
				if(c==1) {
					continue;
				}else if(c==2) {
					Order o=new Order();//�½�����
					o.setAmount(totalAmount);
					o.setCount(totalCount);
					o.setTime(DatetimeUtil.getNow());
					boolean result=addOrder(o);//��Ӷ���
					System.out.println("------------------------------------------");
					if(!result) {
						totalAmount=0;
						totalCount=0;
						continue;	
					}else {
						System.out.println("----����ǰ������Ʒ������"+totalCount+",�ܽ�"+totalAmount+"Ԫ��");
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
