package com.unit10_login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class getOneData {

	public static User getUser(String sql){
		
		Connection conn=null;//���Ӷ���
		Statement stmt=null;//Statement��������ִ��sql���
		User u=null;
		
		try {
			conn=GetConnection.getConnection();
			stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql);//ִ��sql��䲢���ؽ����
			System.out.println("---sql�Ѿ�ִ�У�");
			
			//���������
			if(rs.next()) {
				u=new User(rs.getInt("id"),rs.getString("name"),rs.getString("password"));
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
		return u;
	}

}
