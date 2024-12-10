package com.unit10.test5;

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
				User u=new User(rs.getInt("id"),rs.getString("name"),rs.getString("password"));
				System.out.println(u.getId());
				System.out.println(u.getName());
				System.out.println(u.getPassword());
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
