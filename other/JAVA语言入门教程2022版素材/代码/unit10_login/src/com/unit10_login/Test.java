package com.unit10_login;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("ÇëÊäÈëÓÃ»§Ãû£º");
		String uname=s.next();
		System.out.println("ÇëÊäÈëÃÜÂë£º");
		String upwd=s.next();
		
		String sql="select * from users where name='"+uname+"' and password='"+upwd+"';";
		User user=getOneData.getUser(sql);
		if(user==null) {
			System.out.println("µÇÂ¼Ê§°Ü£¡");
		}else {
			System.out.println("µÇÂ¼³É¹¦£¡»¶Ó­Äã£¬"+user.getName());
		}
		

	}

}
