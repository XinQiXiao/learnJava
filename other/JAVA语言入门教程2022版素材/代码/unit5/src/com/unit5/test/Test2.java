package com.unit5.test;
import java.util.Scanner;
/*
ģ������ATM����ȡ�����ع��ܣ��������ݣ�
1.ģ��3�����п�,1001,1002,1003,�ֱ�������������(������9�������ֱ𱣴濨��.��������)��
2.��ʾ�û��������п������룻
3.����û�������ȷ---��ʾ���û�ѡ��ȡ��.�����˳�,����ʾ�����٣�       �������---�������뿨�����룻
4.ѡ��ȡ��---��ʾ����ȡ����,����������,��ʾ����;����,������ϼ�����Ӧ���;
5.ѡ����---��������,��������Ӧ���,����ʾ������;
6.ѡ���˳�---�˿�
7.����3����������˺�����,��ʾ���п��ѱ�����
*/
public class Test2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String cid1="1001";
		String cpassword1="123";
		double cbalance1=1000;
		
		String cid2="1002";
		String cpassword2="123";
		double cbalance2=2000;
		
		String cid3="1003";
		String cpassword3="123";
		double cbalance3=3000;
		
		int count=0; //�����������Ĵ���
		while(true) {
			//��¼
			double balance=0;//����Ҫ����������Ϣ
			System.out.println("�����뿨�ţ�");
			String id=input.next();
			System.out.println("���������룺");
			String pwd=input.next();
			if(cid1.equals(id)&&cpassword1.equals(pwd)) {
				balance=cbalance1;
				count=0;//������ȷ�������������
			}else if(cid2.equals(id)&&cpassword2.equals(pwd)) {
				balance=cbalance2;
				count=0;//������ȷ�������������
			}else if(cid3.equals(id)&&cpassword3.equals(pwd)) {
				balance=cbalance3;
				count=0;//������ȷ�������������
			}else {
				count++;//�������+1
				if(count==3) {
					System.out.println("���Ѿ�����3������������п��ѱ�������");
					break;//��������ֹ������¼��ѭ��
				}else {
					System.out.println("���Ѿ�����"+count+"��������󣡻���"+(3-count)+"�λ��ᣡ");
					continue;
				}
			}
			
			//����ҵ��
			while(true) {
				System.out.println("�������"+balance+"Ԫ��������Ҫ�����ҵ���ţ�1.��� 2.ȡ�� 3.�˿�����");
				int c=input.nextInt();
				if(c==1) {
					//���ƴ��ҵ��
					while(true) {
						System.out.println("���������");
						double money1=input.nextDouble();
						if(money1<=0) {
							System.out.println("�����������0�����������룡");
							continue;
						}else {
							balance+=money1;//���
							System.out.println("-------���"+money1+"Ԫ�����"+balance+"Ԫ��");
							break;
						}
					}
				}else if(c==2){
					//����ȡ��ҵ��
					while(true) {
						System.out.println("������ȡ���");
						double money2=input.nextDouble();
						if(money2>balance) {
							System.out.println("���㣬���������룡");
							continue;
						}else {
							balance-=money2;//ȡ��
							System.out.println("-------ȡ��"+money2+"Ԫ�����"+balance+"Ԫ��");
							break;
						}
					}
				}else if(c==3){
					break;//�˳�����ҵ��ѭ�����������뿨������
				}else {
					System.out.println("û�д�ҵ��������ѡ��");
					continue;
				}
			}
		}
		
	}
}
