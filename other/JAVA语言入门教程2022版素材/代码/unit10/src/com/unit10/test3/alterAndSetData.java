package com.unit10.test3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import util.GetConnection;

public class alterAndSetData {

	public static void main(String[] args){
		
		Connection conn=null;//���Ӷ���
		Statement stmt=null;//Statement��������ִ��sql���
		
		
		try {
			conn=GetConnection.getConnection();
			stmt=conn.createStatement();
			//String sql1="insert into users values(4,'zhaoliu','123a');";
			//String sql2="delete from users where id=4;";
			String sql3="update users set name='����' where name='wangwu';";
			stmt.execute(sql3);//ִ��sql���
			System.out.println("---�����Ѹ��£�");
			
		} catch (Exception e) {
			System.out.println("�����쳣��"+e);
		}finally{
			//�ر�Statement
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			//�ر����ݿ�����
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		

	}

}
