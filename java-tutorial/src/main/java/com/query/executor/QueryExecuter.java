package com.query.executor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryExecuter {
	private static Connection connection;
	private static Statement stmt;

	static {
		final String driverName = System.getProperty("driver", "org.postgresql.Driver");
		final String url = System.getProperty("url",
				"jdbc:postgresql://localhost:5432/postgres");

		final String userName = System.getProperty("username", "postgres");

		final String password = System.getProperty("password", "postgres");
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, userName, password);
			stmt = connection.createStatement();
			if (null != connection) {
				System.out.println("Database Connection Established....");
			}
		} catch (final SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException, SQLException {

		System.out.println("Current Thread :" + Thread.currentThread().getName());
		for (int i = 1; i < 100; i++) {
			new Thread(() -> {
				try {
					System.out.println("Current Thread :" + Thread.currentThread().getName());
					stmt.execute("set search_path=frm_gateway");
					stmt.execute("insert into student(sname,smarks) values('raju',1)");
				} catch (final SQLException e) {
					e.printStackTrace();
				}

			}).start();

		}
		Thread.sleep(5000);
		
		final ResultSet rs=stmt.executeQuery("Select * from student");
		System.out.println("id name marks");
		while(rs.next())
		{
			
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
	}

}
