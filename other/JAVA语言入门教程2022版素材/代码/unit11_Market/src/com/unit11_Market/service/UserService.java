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
		System.out.println("�������û�����");
		String uname=s.next();
		System.out.println("���������룺");
		String upwd=s.next();
		String sql="select * from users where name='"+uname+"' and password='"+upwd+"'";
		ArrayList<User> usersList=userDAO.getDataBySql(sql);
		if(usersList.size()>0) {
			u=usersList.get(0);//��½�ɹ���
			System.out.println("-------------��½�ɹ�����ӭ��,"+u.getName()+"��");
		}else {
			System.out.println("-------------��¼ʧ�ܣ�");
		}
		return u;
	}
}
