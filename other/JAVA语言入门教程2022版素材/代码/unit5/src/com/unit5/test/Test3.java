package com.unit5.test;

import java.util.Scanner;

public class Test3 {
	/*
	 ����һ�����й���ϵͳ�����г�������Ʒ��������Ա����ϵͳ������
	ʵ�����ݣ�
	1.�û���¼����¼�ɹ����������ܲ˵�����¼ʧ�������µ�¼��
	2.���˵��У������û�ѡ�񣬽����ӹ��ܲ˵�������ҵ���ݲ�ʵ�֣���
	3.ʵ�����˵����Ӳ˵��������л���
	
	51���й���ϵͳ�����¹��ܣ�
	����̨����Ʒ��������������Ա�⡢Ա������
	��Ʒ�����������Ʒ�б���Ʒ�ϼܡ���Ʒ�¼ܡ���Ʒ�༭
	������������������б�ɾ������
	��Ա��İ������鿴��Ա���༭��Ա��Ϣ
	Ա�������еİ������鿴����Ա������ְ����ְ����Ϣ�༭	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("*****************51���й���ϵͳ 1.0********************");
		//�û���¼
		boolean msg=false;//false--ʧ��  true---�ɹ�
		while(true) {
			System.out.println("�������û�����");
			String uname=input.next();
			System.out.println("�������û����룺");
			String upwd=input.next();
			
			if("zhangsan".equals(uname)&&"12345".equals(upwd)) {
				System.out.println("��ϲ�㣡��¼�ɹ���");
				msg=true;
				break;
			}else {
				System.out.println("��¼ʧ�ܣ������µ�¼��");
				continue;
			}
		}
		//��¼�ɹ�ʱ������˵�
		if(msg) {
			while(true) {
				System.out.println("------------------���˵�-----------------");
				System.out.println("-1.����̨��");
				System.out.println("-2.��Ʒ����");
				System.out.println("-3.��������");
				System.out.println("-4.��Ա�⣻");
				System.out.println("-5.Ա������");
				System.out.println("-6.�˳�����");
				System.out.println("-----------------------------------");
				System.out.println("-�����빦�ܱ�ţ�");
				int c1=input.nextInt();
				if(c1==1) {
					System.out.println("������.....");
				}else if(c1==2) {
					while(true) {
						System.out.println("------------------��Ʒ����-----------------");
						System.out.println("-1.��ʾ������Ʒ��");
						System.out.println("-2.�ϼ���Ʒ��");
						System.out.println("-3.�¼���Ʒ��");
						System.out.println("-4.��Ʒ��Ϣ�޸ģ�");
						System.out.println("-5.�˳���");
						System.out.println("-----------------------------------");
						System.out.println("-�����빦�ܱ�ţ�");
						int c11=input.nextInt();
						if(c11==5) {
							break;
						}
					}
				}else if(c1==3) {
					while(true) {
						System.out.println("------------------��������-----------------");
						System.out.println("-1.��ʾ������Ʒ��");
						System.out.println("-2.�ϼ���Ʒ��");
						System.out.println("-3.�¼���Ʒ��");
						System.out.println("-4.��Ʒ��Ϣ�޸ģ�");
						System.out.println("-5.�˳���");
						System.out.println("-----------------------------------");
						System.out.println("-�����빦�ܱ�ţ�");
						int c11=input.nextInt();
						if(c11==5) {
							break;
						}
					}
				}else if(c1==4) {
					while(true) {
						System.out.println("------------------��Ա��-----------------");
						System.out.println("-1.��ʾ������Ʒ��");
						System.out.println("-2.�ϼ���Ʒ��");
						System.out.println("-3.�¼���Ʒ��");
						System.out.println("-4.��Ʒ��Ϣ�޸ģ�");
						System.out.println("-5.�˳���");
						System.out.println("-----------------------------------");
						System.out.println("-�����빦�ܱ�ţ�");
						int c11=input.nextInt();
						if(c11==5) {
							break;
						}
					}
				}else if(c1==5) {
					while(true) {
						System.out.println("------------------Ա������-----------------");
						System.out.println("-1.��ʾ������Ʒ��");
						System.out.println("-2.�ϼ���Ʒ��");
						System.out.println("-3.�¼���Ʒ��");
						System.out.println("-4.��Ʒ��Ϣ�޸ģ�");
						System.out.println("-5.�˳���");
						System.out.println("-----------------------------------");
						System.out.println("-�����빦�ܱ�ţ�");
						int c11=input.nextInt();
						if(c11==5) {
							break;
						}
					}
				}else if(c1==6) {
					System.out.println("�����˳�....");
					break;
				}else {
					System.out.println("û�д˹��ܣ�������ѡ��");
					continue;
				}
				
			}
		}
		
		

	}

}
