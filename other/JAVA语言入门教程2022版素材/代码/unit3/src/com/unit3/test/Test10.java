package com.unit3.test;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("���ܼ������Ͳͣ�1-7����");
		int day=input.nextInt();
		
		if(day==1) {
			System.out.println("�ؼ۲ˣ�ˮ���㣡");
		}else if(day==2) {
			System.out.println("�ؼ۲ˣ����Źǣ�");
		}else if(day==3 || day==4) {
			System.out.println("�ؼ۲ˣ�����������");
		}else{
			System.out.println("�ؼ۲ˣ��ɹ��ʳ���");
		}
		
		
	
	}

}
