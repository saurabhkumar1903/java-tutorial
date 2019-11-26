package com.tutorial.thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyThread implements Runnable{
	
	private String message;

	public MyThread(String message) {
		this.message=message;
	}

	@Override
	public void run() {
		
		System.out.println("Started :"+Thread.currentThread().getName() +" at "+LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
		System.out.println("Message From Thread :"+Thread.currentThread().getName()+" :"+message);
		for(int i=0;i<5;i++)
		{
			System.out.println("i :"+i+ " Thread name:"+Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
