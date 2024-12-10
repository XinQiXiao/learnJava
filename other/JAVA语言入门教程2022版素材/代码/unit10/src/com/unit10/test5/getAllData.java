package com.unit10.test5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import util.GetConnection;

public class getAllData {

	public static void main(String[] args){
		
		Connection conn=null;//连接对象
		Statement stmt=null;//Statement对象，用于执行sql语句
		
		try {
			conn=GetConnection.getConnection();
			stmt=conn.createStatement();
			String sql="select * from users;";
			ResultSet rs=stmt.executeQuery(sql);//执行sql语句并返回结果集
			System.out.println("---sql已经执行！");
			
			//解析结果集
			ArrayList<User> usersList=new ArrayList<User>();
			while(rs.next()) {
				User u=new User(rs.getInt("id"),rs.getString("name"),rs.getString("password"));
				usersList.add(u);
			}
			
			for(User u:usersList) {
				System.out.println(u.getName());
			}
			
		} catch (Exception e) {
			System.out.println("出现异常："+e);
		}finally{
			//关闭Statement
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			//关闭数据库连接
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		

	}

}
