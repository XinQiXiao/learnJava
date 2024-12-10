package com.unit10_goodsManager;

//运行入口
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
