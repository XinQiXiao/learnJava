package com.unit11_Market.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.unit11_Market.pojo.User;
import com.unit11_Market.util.GetConnection;

public class UserDAO {
	//≤È—Ø
	public ArrayList<User> getDataBySql(String sql) {
		Connection conn=null;
		Statement stmt=null;
		ArrayList<User> usersList=new ArrayList<User>();
		try {
			conn=GetConnection.getConnection();
			stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql); 
			while(rs.next()) {
				User user=new User(rs.getInt("id"),rs.getString("name"),rs.getString("password"),rs.getString("permission"));
				usersList.add(user);
			}
			
		}catch(Exception e) {
			System.out.println("DAO“Ï≥££∫"+e);
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
		return usersList;
	}
}
