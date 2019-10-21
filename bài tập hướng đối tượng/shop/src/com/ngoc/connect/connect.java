package com.ngoc.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class connect {
	public static Connection getJDBCConnection()
	{
final String url ="jdbc:mysql://localhost:3306/shop";
final String user ="root";
final String password ="ngocuyen";
try {
	Class.forName("com.mysql.jdbc.Driver");
	return DriverManager.getConnection(url,user,password);
	
}catch (ClassNotFoundException e) {
	e.printStackTrace();
} catch (SQLException e)
{e.printStackTrace();
	};
	
	return null;
}
}
