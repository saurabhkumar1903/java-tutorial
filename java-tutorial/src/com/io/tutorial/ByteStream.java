package com.io.tutorial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;

public class ByteStream {

	public static void main(String[] args) throws SQLException, FileNotFoundException {

		InputStream inputStream = null;
		File[] files = new File("D:\\efrm\\branches\\dev\\efrm-system\\config\\database\\v1.1").listFiles();
		for (File file : files) {
			try {
				System.out.println("Processing File...." + file.getName());
				inputStream = new FileInputStream(file);
				int c;
				OutputStream outputStream = outputStreamSelector(file.getName());
				while ((c = inputStream.read()) != -1) {
					char ch = (char) c;
//					System.out.print(ch);
					outputStream.write(c);
				}
				outputStream.flush();
				outputStream.close();
				inputStream.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		System.out.println("Processing files completed...");
		System.exit(0);

	}

	private static OutputStream outputStreamSelector(String name) throws FileNotFoundException {
		if (name.contains("trigger"))
			return new FileOutputStream("D:\\db-script\\trigger.sql", true);
		else if (name.contains("insert"))
			return new FileOutputStream("D:\\db-script\\insert.sql", true);

		else if (name.contains("delete"))
			return new FileOutputStream("D:\\db-script\\delete.sql", true);

		else if (name.contains("create"))
			return new FileOutputStream("D:\\db-script\\create.sql", true);

		else if (name.contains("update"))
			return new FileOutputStream("D:\\db-script\\update.sql", true);

		else if (name.contains("index"))
			return new FileOutputStream("D:\\db-script\\index.sql", true);

		else if (name.contains("alter"))
			return new FileOutputStream("D:\\db-script\\alter.sql", true);
		else
			return null;
	}

}
