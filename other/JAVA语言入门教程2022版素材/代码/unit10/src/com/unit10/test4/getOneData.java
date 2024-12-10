package com.unit10.test4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.GetConnection;

public class getOneData {

	public static void main(String[] args){
		
		Connection conn=null;//连接对象
		Statement stmt=null;//Statement对象，用于执行sql语句
		
		try {
			conn=GetConnection.getConnection();
			stmt=conn.createStatement();
			String sql="select * from users where id=1;";
			ResultSet rs=stmt.executeQuery(sql);//执行sql语句并返回结果集
			System.out.println("---sql已经执行！");
			
			//解析结果集
			if(rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("password"));
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
