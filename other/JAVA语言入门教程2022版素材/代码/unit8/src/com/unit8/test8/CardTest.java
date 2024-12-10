package com.unit8.test8;

import java.util.ArrayList;

public class CardTest {
	
	public static void main(String[] args) {
		
		Card card1=new Card("1001","abc",1000);
		Card card2=new Card("1002","abc",2000);
		Card card3=new Card("1003","abc",3000);
		Card card4=new Card("1004","abc",7000);
		Card card5=new Card("1005","abc",9000);
		Card card6=new Card("1006","abc",2300);
		
		//对象数组
		Card[] cArray= {card1,card2,card3,card4,card5,card4};
		
		//ArrayList 有序的序列机构  有下标 
		ArrayList cList=new ArrayList();
		
		//添加对象
		cList.add(card1);
		cList.add(card2);
		cList.add(card3);
		cList.add(card4);
		cList.add(card5);
		cList.add(card6);
		
		//获取对象
		Card c=(Card)cList.get(1);
		//System.out.println(c.cid);
		//System.out.println(card2.cid);
		
		//获取元素个数
		System.out.println(cList.size());
		
		//删除对象
		cList.remove(3);
		System.out.println(cList.size());
		
		//修改元素
		Card c1=(Card)cList.get(0);
		c1.cbalance+=500;
		cList.set(0,c1); //替换指定位置的元素
		
		Card c2=(Card)cList.get(0);
		System.out.println(c2.cbalance);
		
		//遍历Arraylist
		for(int i=0;i<cList.size();i++) {
			System.out.println(cList.get(i));
		}
		
	
	}

}
