package com.unit10.test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import util.GetConnection;

public class addData {

	public static void main(String[] args){
		
		Connection conn=null;//���Ӷ���
		Statement stmt=null;//Statement��������ִ��sql���
		
		try {
			conn=GetConnection.getConnection();
			stmt=conn.createStatement();
			String sql="insert into users values(4,'zhaoliu','123a');";
			stmt.execute(sql);//ִ��sql���
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
