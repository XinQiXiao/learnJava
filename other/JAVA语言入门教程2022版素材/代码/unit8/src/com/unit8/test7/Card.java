package com.unit8.test7;

import java.util.Scanner;

public class Card {
	
	Scanner in=new Scanner(System.in);
	String cid;
	String cpwd;
	double cbalance;
	
	public Card(String cid, String cpwd, double cbalance) {
		this.cid = cid;
		this.cpwd = cpwd;
		this.cbalance = cbalance;
	};
	
	//��ѯ���
	public void show() {
		System.out.println("���ţ�"+this.cid+"�����������"+this.cbalance+"Ԫ��");
	}
	
	//���
	public void deposit() {
		System.out.println("���������");
		double amount=in.nextDouble();
		if(amount<=0) {
			System.out.println("�����������0��");
		}else {
			this.cbalance+=amount;
			System.out.println("����"+amount+"Ԫ�����"+this.cbalance+"Ԫ��");
		}
	}
	//ȡ��
	public void draw() {
		System.out.println("������ȡ���");
		double amount=in.nextDouble();
		if(amount>this.cbalance) {
			System.out.println("���㣡");
		}else {
			this.cbalance-=amount;
			System.out.println("ȡ��"+amount+"Ԫ�����"+this.cbalance+"Ԫ��");
		}
	}
	//�޸�����
	public void alterPassword() {
		System.out.println("������ԭ���룺");
		String pwd=in.next();
		if(pwd.equals(this.cpwd)) {
			System.out.println("ԭ������֤�ɹ��������������룺");
			String newPwd=in.next();
			this.cpwd=newPwd;
		}else {
			System.out.println("ԭ������֤ʧ�ܣ�");
		}
	}

}
