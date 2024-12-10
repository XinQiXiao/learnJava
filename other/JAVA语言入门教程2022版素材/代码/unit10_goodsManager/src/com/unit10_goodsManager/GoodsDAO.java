package com.unit10_goodsManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//���ݿ����
public class GoodsDAO {
	
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
	public ArrayList<Goods> getDataBySql(String sql) {
		Connection conn=null;
		Statement stmt=null;
		ArrayList<Goods> goodsList=new ArrayList<Goods>();
		try {
			conn=GetConnection.getConnection();
			stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql); 
			while(rs.next()) {
				Goods good=new Goods(rs.getInt("id"),rs.getString("name"),rs.getDouble("price"));
				goodsList.add(good);
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
		return goodsList;
	}
}
