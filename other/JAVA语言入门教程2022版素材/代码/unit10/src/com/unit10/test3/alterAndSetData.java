package com.unit10.test3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import util.GetConnection;

public class alterAndSetData {

	public static void main(String[] args){
		
		Connection conn=null;//连接对象
		Statement stmt=null;//Statement对象，用于执行sql语句
		
		
		try {
			conn=GetConnection.getConnection();
			stmt=conn.createStatement();
			//String sql1="insert into users values(4,'zhaoliu','123a');";
			//String sql2="delete from users where id=4;";
			String sql3="update users set name='王五' where name='wangwu';";
			stmt.execute(sql3);//执行sql语句
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
