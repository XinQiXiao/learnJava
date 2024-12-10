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
		
		Connection conn=null;//���Ӷ���
		Statement stmt=null;//Statement��������ִ��sql���
		
		try {
			conn=GetConnection.getConnection();
			stmt=conn.createStatement();
			String sql="select * from users;";
			ResultSet rs=stmt.executeQuery(sql);//ִ��sql��䲢���ؽ����
			System.out.println("---sql�Ѿ�ִ�У�");
			
			//���������
			ArrayList<User> usersList=new ArrayList<User>();
			while(rs.next()) {
				User u=new User(rs.getInt("id"),rs.getString("name"),rs.getString("password"));
				usersList.add(u);
			}
			
			for(User u:usersList) {
				System.out.println(u.getName());
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
