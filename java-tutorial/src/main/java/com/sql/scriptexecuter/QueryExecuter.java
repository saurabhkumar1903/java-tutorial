package com.sql.scriptexecuter;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class QueryExecuter{

	public static void main(String[] args) throws SQLException {
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
		File[] files = new File(destination).listFiles();
		for (File file : files) {
			if (!file.getName().contains("trigger")) {
				try {
					System.out.println("Processing File...." + file.getName());
					inputStream = new FileInputStream(file);
					int c;
					str = new StringBuilder();
					list.clear();
					while ((c = inputStream.read()) != -1) {
						char ch = (char) c;
						str.append(ch);
						if (ch == ';') {
							list.add(str.toString());
							str.delete(0, str.length());
						}
					}
					inputStream.close();

				} catch (Exception e) {
					e.printStackTrace();
				}

				for (String query : list) {
					System.out.println("Executing Query::" + query);

					try {

						stmt.executeUpdate(query);
						// con.commit();
					} catch (Exception e) {
						e.printStackTrace();
					}

				}

			}
			else
			System.out.println("Processing Trigger file::"+file.getName());
		}
	}

}
