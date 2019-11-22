package com.tutorial.thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ThreadExample {
	public static void main(String[] args) {

		Thread t1 = new Thread(new MyThread("Hello I am T1"), "T1");
		t1.start();
		Thread t2 = new Thread(new MyThread("Hello I am T2"), "T2");
		
		try {
			System.out.println(Thread.currentThread().getName()+"Waiting at :"+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
			t1.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();

	}

}
