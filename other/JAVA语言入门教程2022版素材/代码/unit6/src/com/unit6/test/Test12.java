package com.unit6.test;
import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[] numArray= {"1001","1002","1003","1004","1005"};//������Ʒ���
		String[] nameArray= {"ƻ��","�㽶","����","����","����"};//������Ʒ����
		double[] priceArray= {5,3,4,12,2};//������Ʒ�۸�
		
		//��ʾ��Ʒ�б�
		System.out.println("���----------����------------�۸�");
		for(int i=0;i<numArray.length;i++) {
			System.out.println(numArray[i]+"---"+nameArray[i]+"---"+priceArray[i]);
		}
		System.out.println("--------------------------------");
		
		//��Ʒ�ϼܣ�������Ʒ��
		String[] numArray2=new String[numArray.length+1];//������Ʒ���
		String[] nameArray2=new String[nameArray.length+1];//������Ʒ����
		double[] priceArray2=new double[priceArray.length+1];//������Ʒ�۸�
		while(true) {
			int msg=0;//�����Ƿ���Ҫ�������� 0����Ҫ 1��Ҫ
			
			System.out.println("��������Ʒ��ţ�");
			String num=input.next();
			for(String n:numArray) {
				if(num.equals(n)) {
					System.out.println("��Ʒ����Ѵ��ڣ����������룡");
					msg=1;
					break;
				}
			}
			if(msg==1) {
				continue;
			}
			
			System.out.println("��������Ʒ���ƣ�");
			String name=input.next();
			for(String x:nameArray) {
				if(name.equals(x)) {
					System.out.println("��Ʒ�����Ѵ��ڣ����������룡");
					msg=1;
					break;
				}
			}
			if(msg==1) {
				continue;
			}
			
			System.out.println("��������Ʒ�۸�");
			double price=input.nextDouble();
			
			//�������
			for(int i=0;i<numArray.length;i++) {
				numArray2[i]=numArray[i];
				nameArray2[i]=nameArray[i];
				priceArray[i]=priceArray[i];
			}
			numArray2[numArray2.length-1]=num;
			nameArray2[nameArray2.length-1]=name;
			priceArray2[priceArray2.length-1]=price;
			break;
		}
		
		//��ʾ��Ʒ�б�
		System.out.println("���----------����------------�۸�");
		for(int i=0;i<numArray2.length;i++) {
			System.out.println(numArray2[i]+"---"+nameArray2[i]+"---"+priceArray2[i]);
		}
		System.out.println("--------------------------------");
	}
}
