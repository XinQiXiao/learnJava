package com.unit10_goodsManager;

//�������
public class Application {
	
	public static void main(String[] args) {
		GoodsService gs=new GoodsService();
		gs.showAllGoods();
		//gs.addGoods();
		//gs.delGood();
		gs.setPrice();
		gs.showAllGoods();
	}

}
