package com.unit8_market.pojo;
import java.util.ArrayList;
import java.util.Scanner;

public class Market {
	
	Scanner in=new Scanner(System.in);
	
	//����Ʒ�б���ΪMarket�������
	public ArrayList goodsList= new ArrayList();
	
	//��ʾ��Ʒ�б�
	public void showAllGoods() {
		System.out.println("-���-------����--------�۸�-");
		for(int i=0;i<this.goodsList.size();i++) {
			Good good=(Good)this.goodsList.get(i);
			good.show();
		}
	}
	//�ϼ�
	public void addGood() {
		System.out.println("-------------��Ʒ�ϼ�--------------");
		System.out.println("��������Ʒ��ţ�");
		int inputGid=in.nextInt();
		System.out.println("��������Ʒ���ƣ�");
		String inputName=in.next();
		System.out.println("��������Ʒ�۸�");
		double inputPrice=in.nextDouble();
		int msg=0;
		for(int i=0;i<this.goodsList.size();i++) {
			Good good=(Good)this.goodsList.get(i);
			if(inputGid==good.gid || inputName.equals(good.name)) {
				System.out.println("��Ʒ��Ϣ�ظ���");
				msg=1;
			}
		}
		//�����Ʒ
		if(msg==0) {
			Good good=new Good(inputGid,inputName,inputPrice);
			this.goodsList.add(good);
			System.out.println("��Ʒ��Ϣ��ӳɹ�����");
		}
	}
	
	//�¼�
	public void delGood() {
		System.out.println("-------------��Ʒ�¼�--------------");
		System.out.println("��������Ʒ��ţ�");
		int inputGid=in.nextInt();
		int msg=0;
		for(int i=0;i<this.goodsList.size();i++) {
			Good good=(Good)this.goodsList.get(i);
			if(inputGid==good.gid) {
				this.goodsList.remove(i);//ɾ���ҵ��ĵ�ǰ��Ʒ
				System.out.println("��Ʒ��Ϣɾ���ɹ�����");
				msg=1;
			}
		}
		if(msg==0) {
			System.out.println("û�д���Ʒ��");
		}
	}
	
	//�޸ļ۸�
	public void alterPrice() {
		System.out.println("-------------�޸ļ۸�--------------");
		System.out.println("��������Ʒ��ţ�");
		int inputGid=in.nextInt();
		int msg=0;
		for(int i=0;i<this.goodsList.size();i++) {
			Good good=(Good)this.goodsList.get(i);
			if(inputGid==good.gid) {
				System.out.println("�������µ���Ʒ�۸�");
				good.price=in.nextDouble();
				this.goodsList.set(i, good);
				msg=1;
			}
		}
		if(msg==0) {
			System.out.println("û�д���Ʒ��");
		}
	}
	
}
