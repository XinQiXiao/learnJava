package com.unit11_Market.service;

import java.util.ArrayList;
import java.util.Scanner;
import com.unit11_Market.DAO.GoodDAO;
import com.unit11_Market.pojo.Good;

//��дGoods�����ҵ�񷽷�
public class GoodService {
	
	GoodDAO goodDAO=new GoodDAO();
	
	//��ʾ��Ʒ�б�
	public void showAllGoods() {
		String sql="select * from goods;";
		ArrayList<Good> goodsList=goodDAO.getDataBySql(sql);
		System.out.println("---------------------��ʾ��Ʒ�б�---------------------");
		for(Good good:goodsList) {
			System.out.println(good.getId()+"   "+good.getName()+"   "+good.getPrice()+"   "+good.getStock());
		}
		System.out.println("---------------------------");
	} 
	
	//��Ʒ�ϼ�
	public void addGoods() {
		System.out.println("---------------------��Ʒ�ϼ�---------------------");
		Scanner s=new Scanner(System.in);
		System.out.println("���������ӵ���Ʒ���ƣ�");
		String name=s.next();
		System.out.println("���������ӵ���Ʒ�۸�");
		double price=s.nextDouble();
		String sql="insert into goods(name,price) values('"+name+"',"+price+");";
		boolean result=goodDAO.setDataBySql(sql);
		if (result) {
			System.out.println("-----��ӳɹ���");
		}else {
			System.out.println("------���ʧ�ܣ�");
		}
	}
	
	//��Ʒ�¼�
	public void delGood() {
		System.out.println("---------------------��Ʒ�¼�---------------------");
		Scanner s=new Scanner(System.in);
		System.out.println("������Ҫɾ������Ʒid��");
		int id=s.nextInt();
		
		String sql="delete from goods where id="+id+";";
		boolean result=goodDAO.setDataBySql(sql);
		if (result) {
			System.out.println("-----ɾ���ɹ���");
		}else {
			System.out.println("------ɾ��ʧ�ܣ�");
		}
	}
	
	//��Ʒ�۸��޸�
	public void setPrice() {
		System.out.println("---------------------�޸ļ۸�---------------------");
		Scanner s=new Scanner(System.in);
		System.out.println("������Ҫ�޸ĵ���Ʒid��");
		int id=s.nextInt();
		System.out.println("�����µļ۸�");
		double newPrice=s.nextDouble();
		String sql="update goods set price="+newPrice+" where id="+id+";";
		boolean result=goodDAO.setDataBySql(sql);
		if (result) {
			System.out.println("-----�޸ĳɹ���");
		}else {
			System.out.println("------�޸�ʧ�ܣ�");
		}
	}
	
	//���ÿ��
	public void setStock() {
		System.out.println("---------------------�������---------------------");
		Scanner s=new Scanner(System.in);
		System.out.println("������Ҫ�޸ĵ���Ʒid��");
		int id=s.nextInt();
		System.out.println("�����µĿ�棺");
		int stock=s.nextInt();
		if(stock>=0) {
			String sql="update goods set stock="+stock+" where id="+id+";";
			boolean result=goodDAO.setDataBySql(sql);
			if (result) {
				System.out.println("-----������óɹ���");
			}else {
				System.out.println("------�������ʧ�ܣ�");
			}
		}else {
			System.out.println("-----���õĿ�治����С��0��");
		}
		
	}
	
	//�������
	public boolean addAndMinusStock(Good good,int num) {
		boolean result=false;
		if(num+good.getStock()>=0) {
			String sql="update goods set stock="+(num+good.getStock())+" where id="+good.getId()+";";
			result=goodDAO.setDataBySql(sql);
		}else {
			System.out.println("-----���õĿ�治����С��0��");
		}
		return result;	
	}
}
