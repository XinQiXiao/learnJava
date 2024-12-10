package com.unit8.test7;

public class CardTest {
	
	public static void main(String[] args) {
		Card card1=new Card("1001","abc",1000);
		Card card2=new Card("1002","abc",2000);
		Card card3=new Card("1003","abc",3000);
		
		//card2.deposit();
		//card2.draw();
		card2.alterPassword();
		System.out.println(card2.cpwd);
	}

}
