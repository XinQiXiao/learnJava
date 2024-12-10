package com.unit10.test4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.GetConnection;

public class getOneData {

	public static void main(String[] args){
		
		Connection conn=null;//���Ӷ���
		Statement stmt=null;//Statement��������ִ��sql���
		
		try {
			conn=GetConnection.getConnection();
			stmt=conn.createStatement();
			String sql="select * from users where id=1;";
			ResultSet rs=stmt.executeQuery(sql);//ִ��sql��䲢���ؽ����
			System.out.println("---sql�Ѿ�ִ�У�");
			
			//���������
			if(rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("password"));
			}
			
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
