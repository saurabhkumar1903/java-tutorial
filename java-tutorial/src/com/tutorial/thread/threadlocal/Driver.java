package com.tutorial.thread.threadlocal;

import java.text.SimpleDateFormat;

public class Driver {
	public static void main(String[] args) {

		// withoutThreadLocal();
		withThreadLocal();
	}

	private static void withoutThreadLocal() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("DD--MM--yyyy");
		MyThreadLocal myThreadLocal = new MyThreadLocal(simpleDateFormat);
		Thread t1 = new Thread(myThreadLocal, "T1");
		Thread t2 = new Thread(myThreadLocal, "T2");
		Thread t3 = new Thread(myThreadLocal, "T3");
		Thread t4 = new Thread(myThreadLocal, "T4");
		Thread t5 = new Thread(myThreadLocal, "T5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

	private static void withThreadLocal() {

		MyThreadLocal myThreadLocal = new MyThreadLocal();
		for(int i=1;i<=10;i++)
		{
			Thread t1 = new Thread(myThreadLocal, "T"+i);
			t1.start();
		}
	
	}

}
