package com.unit11_Market.service;
import java.util.ArrayList;
import java.util.Scanner;

import com.unit11_Market.DAO.UserDAO;
import com.unit11_Market.pojo.User;

public class UserService {
	UserDAO userDAO=new UserDAO();
	
	public User login(){
		User u=null;
		Scanner s=new Scanner(System.in);
		System.out.println("请输入用户名：");
		String uname=s.next();
		System.out.println("请输入密码：");
		String upwd=s.next();
		String sql="select * from users where name='"+uname+"' and password='"+upwd+"'";
		ArrayList<User> usersList=userDAO.getDataBySql(sql);
		if(usersList.size()>0) {
			u=usersList.get(0);//登陆成功！
			System.out.println("-------------登陆成功！欢迎你,"+u.getName()+"！");
		}else {
			System.out.println("-------------登录失败！");
		}
		return u;
	}
}
