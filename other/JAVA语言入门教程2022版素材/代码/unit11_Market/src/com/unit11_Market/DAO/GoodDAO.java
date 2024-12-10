package com.unit11_Market.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.unit11_Market.pojo.Good;
import com.unit11_Market.util.GetConnection;

//数据库操作
public class GoodDAO {
	
	//增删改操作
	public boolean setDataBySql(String sql) {
		Connection conn=null;
		Statement stmt=null;
		boolean msg=false;
		try {
			conn=GetConnection.getConnection();
			stmt=conn.createStatement();
			int i=stmt.executeUpdate(sql); //返回更新条数
			if(i>0) {
				msg=true;
			}
		}catch(Exception e) {
			System.out.println("DAO异常："+e);
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
	
	
	//查询
	public ArrayList<Good> getDataBySql(String sql) {
		Connection conn=null;
		Statement stmt=null;
		ArrayList<Good> goodsList=new ArrayList<Good>();
		try {
			conn=GetConnection.getConnection();
			stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql); 
			while(rs.next()) {
				Good good=new Good(rs.getInt("id"),rs.getString("name"),rs.getDouble("price"),rs.getInt("stock"));
				goodsList.add(good);
			}
			
		}catch(Exception e) {
			System.out.println("DAO异常："+e);
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
