package com.unit8_market.test;
import com.unit8_market.pojo.Good; //��ͬ���У���Ҫ������
import com.unit8_market.pojo.Market;

public class Test {

	public static void main(String[] args) {
		//����������Ʒ����
		Good g1=new Good(1001,"ƻ��",5);
		Good g2=new Good(1002,"�㽶",3);
		Good g3=new Good(1003,"����",2);
		Good g4=new Good(1004,"����",6);
		Good g5=new Good(1005,"����",9);
		
		//�����г����󲢴�����Ʒ��Ϣ
		Market market=new Market();
		market.goodsList.add(g1);
		market.goodsList.add(g2);
		market.goodsList.add(g3);
		market.goodsList.add(g4);
		market.goodsList.add(g5);
		
		//���÷���
		market.showAllGoods();
		
		market.addGood();
		market.showAllGoods();
		
		market.delGood();
		market.showAllGoods();
		
		market.alterPrice();
		market.showAllGoods();
	}

}
