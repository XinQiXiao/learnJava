package com.unit6.test;

public class Test4 {

	public static void main(String[] args) {
		//1.˳����ң�����һ������, �ٸ���һ��Ԫ��, �ҳ���Ԫ���������е�λ�á�
		
		String[] names= {"����","����","����","��","����","����"};
		for(int i=0;i<names.length;i++) {
			if("����".equals(names[i])) {
				System.out.println(names[i]+"��λ�ã��±꣩��:"+i);
			}
		}

	}

}
