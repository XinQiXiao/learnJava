package com.unit10_goodsManager;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {
	
	private static Connection conn=null;
	private static String address="jdbc:mysql://localhost:3306/market?"
			+ "useSSL=false&serverTimezone=UTC";
	private static String uname="root";
	private static String upwd="123456";
	
	public static Connection getConnection() {
		try {
			conn=null;//清空连接
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(address,uname,upwd);
			System.out.println("------数据库连接成功！");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;//返回连接对象
	}
}
