package com.unit8.test7;

public class User {
	String uname;
	String upassword;
	
	public User(String uname, String upassword) {
		this.uname = uname;
		this.upassword = upassword;
	}

	public String login(String name,String pwd) {
		String result="ʧ��";
		if(name.equals(this.uname)&&pwd.equals(this.upassword)) {
			result="�ɹ�";
		}
		return result;
	}
}
