package com.unit11_Market.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

import com.unit11_Market.pojo.Order;
import com.unit11_Market.util.GetConnection;

public class OrderDAO {
	//��ɾ�Ĳ���
	public boolean setDataBySql(String sql) {
		Connection conn=null;
		Statement stmt=null;
		boolean msg=false;
		try {
			conn=GetConnection.getConnection();
			stmt=conn.createStatement();
			int i=stmt.executeUpdate(sql); //���ظ�������
			if(i>0) {
				msg=true;
			}
		}catch(Exception e) {
			System.out.println("DAO�쳣��"+e);
		}finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return msg;
	}
	
	
	//��ѯ
	public ArrayList<Order> getDataBySql(String sql) {
		Connection conn=null;
		Statement stmt=null;
		ArrayList<Order> ordersList=new ArrayList<Order>();
		try {
			conn=GetConnection.getConnection();
			stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql); 
			while(rs.next()) {
				Order order=new Order(rs.getInt("id"),rs.getInt("count"),rs.getDouble("amount"),rs.getTimestamp("time"));
				Calendar cal;
				ordersList.add(order);
			}
			
		}catch(Exception e) {
			System.out.println("DAO�쳣��"+e);
		}finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return ordersList;
	}
}
