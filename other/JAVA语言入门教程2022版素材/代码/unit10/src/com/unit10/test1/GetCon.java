package com.unit10.test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetCon {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//����jdbc����
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//��ȡ���Ӷ���
		String address="jdbc:mysql://localhost:3306/javadb?"
				+ "useSSL=false&serverTimezone=UTC";
		String uname="root";
		String upwd="123456";
		Connection conn=DriverManager.getConnection(address,uname,upwd);
		System.out.println("------���ݿ����ӳɹ���");
		
		//�ر����ݿ�����
		conn.close();
		

	}

}
