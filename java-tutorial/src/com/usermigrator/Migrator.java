package com.usermigrator;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Migrator {
	
	
	public Statement dataBaseUtility() throws SQLException
	{
		final String driverName=System.getProperty("driver", "org.postgresql.Driver");
		final String url=System.getProperty("url", "jdbc:postgresql://172.18.61.1:5432/postgres");

		final String userName=System.getProperty("username", "postgres");

		final String password=System.getProperty("password", "postgres");

		final String destination=System.getProperty("destination", "D:\\efrm\\branches\\dev\\efrm-system\\config\\database\\v1.1");
		List<String> list = new ArrayList<String>();
		try {
			//Class.forName("org.postgresql.Driver");
			Class.forName(driverName);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userName,password);
			// con.setAutoCommit(false);
			System.out.println("Connection Check::" + (null != con));

		} catch (Exception e) {
			e.printStackTrace();
		}
		InputStream inputStream = null;
		StringBuilder str = null;
		Statement stmt = con.createStatement();
		stmt.execute("set search_path=frm_gateway");
		return stmt;
	
	}
	
	
	public static void main(String[] args) {
		
		
		
		
		
		
	}

}
