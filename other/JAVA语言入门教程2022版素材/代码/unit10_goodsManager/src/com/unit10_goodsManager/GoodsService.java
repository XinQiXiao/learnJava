package com.unit10_goodsManager;

import java.util.ArrayList;
import java.util.Scanner;

//��дGoods�����ҵ�񷽷�
public class GoodsService {
	
	GoodsDAO goodsDAO=new GoodsDAO();
	
	//��ʾ��Ʒ�б�
	public void showAllGoods() {
		String sql="select * from goods;";
		ArrayList<Goods> goodsList=goodsDAO.getDataBySql(sql);
		System.out.println("-----------��Ʒ�б�-----------");
		for(Goods good:goodsList) {
			System.out.println(good.getId()+"   "+good.getName()+"   "+good.getPrice());
		}
		System.out.println("---------------------------");
	} 
	
	//��Ʒ�ϼ�
	public void addGoods() {
		Scanner s=new Scanner(System.in);
		System.out.println("���������ӵ���Ʒ���ƣ�");
		String name=s.next();
		System.out.println("���������ӵ���Ʒ�۸�");
		double price=s.nextDouble();
		String sql="insert into goods(name,price) values('"+name+"',"+price+");";
		boolean result=goodsDAO.setDataBySql(sql);
		if (result) {
			System.out.println("-----��ӳɹ���");
		}else {
			System.out.println("------���ʧ�ܣ�");
		}
	}
	
	//��Ʒ�¼�
	public void delGood() {
		Scanner s=new Scanner(System.in);
		System.out.println("������Ҫɾ������Ʒid��");
		int id=s.nextInt();
		
		String sql="delete from goods where id="+id+";";
		boolean result=goodsDAO.setDataBySql(sql);
		if (result) {
			System.out.println("-----ɾ���ɹ���");
		}else {
			System.out.println("------ɾ��ʧ�ܣ�");
		}
	}
	
	//��Ʒ�۸��޸�
	public void setPrice() {
		Scanner s=new Scanner(System.in);
		System.out.println("������Ҫ�޸ĵ���Ʒid��");
		int id=s.nextInt();
		System.out.println("�����µļ۸�");
		double newPrice=s.nextDouble();
		String sql="update goods set price="+newPrice+" where id="+id+";";
		boolean result=goodsDAO.setDataBySql(sql);
		if (result) {
			System.out.println("-----�޸ĳɹ���");
		}else {
			System.out.println("------�޸�ʧ�ܣ�");
		}
	}
}
