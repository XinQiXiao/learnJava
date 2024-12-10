package com.unit8.test7;

public class User {
	String uname;
	String upassword;
	
	public User(String uname, String upassword) {
		this.uname = uname;
		this.upassword = upassword;
	}

	public String login(String name,String pwd) {
		String result="Ê§°Ü";
		if(name.equals(this.uname)&&pwd.equals(this.upassword)) {
			result="³É¹¦";
		}
		return result;
	}
}
