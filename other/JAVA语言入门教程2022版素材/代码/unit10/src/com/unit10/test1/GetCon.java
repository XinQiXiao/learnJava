package com.unit10.test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetCon {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//加载jdbc驱动
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//获取连接对象
		String address="jdbc:mysql://localhost:3306/javadb?"
				+ "useSSL=false&serverTimezone=UTC";
		String uname="root";
		String upwd="123456";
		Connection conn=DriverManager.getConnection(address,uname,upwd);
		System.out.println("------数据库连接成功！");
		
		//关闭数据库连接
		conn.close();
		

	}

}
