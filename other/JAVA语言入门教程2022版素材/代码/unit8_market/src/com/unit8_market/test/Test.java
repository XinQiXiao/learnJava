package com.unit8_market.test;
import com.unit8_market.pojo.Good; //不同包中，需要先引入
import com.unit8_market.pojo.Market;

public class Test {

	public static void main(String[] args) {
		//创建所有商品对象
		Good g1=new Good(1001,"苹果",5);
		Good g2=new Good(1002,"香蕉",3);
		Good g3=new Good(1003,"西瓜",2);
		Good g4=new Good(1004,"桃子",6);
		Good g5=new Good(1005,"葡萄",9);
		
		//创建市场对象并存入商品信息
		Market market=new Market();
		market.goodsList.add(g1);
		market.goodsList.add(g2);
		market.goodsList.add(g3);
		market.goodsList.add(g4);
		market.goodsList.add(g5);
		
		//调用方法
		market.showAllGoods();
		
		market.addGood();
		market.showAllGoods();
		
		market.delGood();
		market.showAllGoods();
		
		market.alterPrice();
		market.showAllGoods();
	}

}
