
package com.unit5.test;
import java.util.Scanner;
/*
��ѡ��ṹ����̨�����У�
1.ʵ��һ���˿Ϳ�������������Ʒ������������Ʒ���������ܽ�
2.һ���˿ͽ�����֮�����̿�ʼ������һ���˿͡�
 * */
public class Test1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String pName1="ƻ��";
		double pPrice1=5;
		String pId1="1001";
		
		String pName2="����";
		double pPrice2=3;
		String pId2="1002";
		
		String pName3="�㽶";
		double pPrice3=4;
		String pId3="1003";
		
		System.out.println("**************��������̨***************");
		//�ظ�������˿ͽ���
		while(true) {
			//ѭ����Ӷ����Ʒ
			int totalNum=0;//������
			double totalAmount=0;//�ܽ��
			while(true) {
				System.out.println("��������Ʒ��ţ�");
				String id=input.next();
				System.out.println("��������Ʒ������");
				int num=input.nextInt();
				String name="";
				double price=0;
				double amount=0;//������Ʒ�Ľ��
				if(pId1.equals(id)) {
					name=pName1;
					price=pPrice1;
				}else if(pId2.equals(id)) {
					name=pName2;
					price=pPrice2;
				}else if(pId3.equals(id)) {
					name=pName3;
					price=pPrice3;
				}else {
					System.out.println("û�д���Ʒ��");
				}
				amount=price*num;
				System.out.println("����ǰ��ӵ���Ʒ�ǣ�"+name+"�����ۣ�"+price+"����"+amount+"Ԫ��");
				
				totalNum+=num;//��������Ʒ�����ӵ���������
				totalAmount+=amount;//��������Ʒ���ӵ��ܽ����
				
				System.out.println("��������밴1�������밴2��ȡ���밴3��");
				int c=input.nextInt();
				if(c==2) {
					break;
				}else if(c==3) {
					totalNum=0;//���������
					totalAmount=0;//�ܽ�����
					System.out.println("-------------------------------");
					continue;
				}
			}
			System.out.println("-----����ǰ�����˼�"+totalNum+"��Ʒ���ܽ��Ϊ"+totalAmount+"Ԫ���븶�");
			
			//ѭ���������㣬ֱ��������쳣
			while(true) {
				System.out.println("�����븶���");
				double money=input.nextDouble();
				if(money>=totalAmount) {
					System.out.println("����"+money+"Ԫ������"+(money-totalAmount)+"Ԫ��");
					break;
				}else {
					System.out.println("������㣬�����¸��");
					continue;
				}
			}
			System.out.println("-------------------------------");
		}
			
		
	}
}
