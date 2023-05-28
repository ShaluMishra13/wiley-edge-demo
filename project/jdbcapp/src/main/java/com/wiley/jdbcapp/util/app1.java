package com.wiley.jdbcapp.util;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class app1 {
public static void main(String[]arvs) {
	try {
		DBConnection dbcon=new DBConnection();
		Connection conn= dbcon.createDBConnection();
		Statement st=conn.createStatement();
		String sql="select first_name,last_name from candidates";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString("first_name")+" "+rs.getString("last_name"));
		}
		try {
			rs.close();
			st.close();
			
		}catch(SQLException e1) {
			e1.getMessage();
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}

