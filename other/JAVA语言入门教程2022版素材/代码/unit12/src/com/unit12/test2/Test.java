package com.unit12.test2;

public class Test {

	public static void main(String[] args) {
		int[] array= {2,13,2435,465,6,4,23,23,0,54,56,823,5,4576,87};
		for(int i:array) {
			
			try {
				//��д���ܻ�����쳣�Ĵ���
				System.out.println("------------"+(10/i));
			}catch(Exception e) {
				//��д�����쳣��ִ�еĴ���   
				System.out.println("�����쳣��");
				e.printStackTrace();//e.printStackTrace() ��ӡ�쳣��Ϣ
			}finally {
				//�����Ƿ����쳣������ִ�еĴ���    
				System.out.println("ִ��һ��ѭ��!");
			}
			
		}
	}

}
