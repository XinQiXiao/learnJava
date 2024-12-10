package com.unit9.test3;

import java.util.Scanner;

public class Card {
	
	Scanner in=new Scanner(System.in);
	private String cid;
	private String cpwd;
	private double cbalance;
	
	public Card(String cid, String cpwd, double cbalance) {
		this.cid = cid;
		this.cpwd = cpwd;
		this.cbalance = cbalance;
	};
	
	
	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		if(cid.length()==19) {
			this.cid = cid;
		}else {
			System.out.println("���ű���Ϊ19λ��");
		}
		
	}

	public void getCpwd() {
		System.out.println("���벻������ʣ�");
	}

	public void setCpwd(String cpwd) {
		if(cid.length()==6) {
			this.cpwd = cpwd;
		}else {
			System.out.println("�������Ϊ6λ��");
		}
	}

	public double getCbalance(String pwd) {
		double b=0;
		if(pwd.equals(this.cpwd)) {
			b = this.cbalance;
		}else {
			System.out.println("�������");
		}
		return b;
	}

	public void setCbalance(double cbalance) {
		if(cbalance>0) {
			this.cbalance = cbalance;
		}else {
			System.out.println("���������0��");
		}
	}

	//����
	private void reward() {
		System.out.println("��ϲ���ô������ֽ�1000Ԫ��");
	}

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
			if(amount>=100000) {
				this.reward();
			}
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
