package com.tutorial.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) {
		Employee employee = new Employee("1", "RAJ", 400d, "Sales");
		serialize(employee);
		Employee emp2=(Employee)deserialize();
		System.out.println(employee);
		System.out.println(emp2);
		if(employee.equals(emp2))
			System.out.println("true");
		else
			System.out.println("false");
	}

	private static Object deserialize() {
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream("ser_obj.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			return objectInputStream.readObject();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e);
			return null;
		}
	}

	private static void serialize(Employee employee) {
		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream("ser_obj.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(employee);
			objectOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
