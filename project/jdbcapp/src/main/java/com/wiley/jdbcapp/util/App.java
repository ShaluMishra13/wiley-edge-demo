package com.wiley.jdbcapp.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class App
{
    public static void main( String[] args )throws Exception
    {
      //  Connection connection = null;

//     
//	}
      //  String url="jdbc:mysql://localhost:3306/wileyclassic";
      //  String username="root";
      //  String password="Shalu13@";
        try(Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyclassic?user=root&password=Shalu13@")){
            PreparedStatement statement = con.prepareStatement("select * from customers");
            ResultSet rs =statement.executeQuery();
            while ((rs.next())){
                System.out.println(rs.getString(1)+" "+rs.getString(2));
            }
        } catch (SQLException e) {

        }
    }}