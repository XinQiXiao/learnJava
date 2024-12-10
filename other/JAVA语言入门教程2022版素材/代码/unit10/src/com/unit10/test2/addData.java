package com.unit10.test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import util.GetConnection;

public class addData {

	public static void main(String[] args){
		
		Connection conn=null;//连接对象
		Statement stmt=null;//Statement对象，用于执行sql语句
		
		try {
			conn=GetConnection.getConnection();
			stmt=conn.createStatement();
			String sql="insert into users values(4,'zhaoliu','123a');";
			stmt.execute(sql);//执行sql语句
			System.out.println("---数据已更新！");
			
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
