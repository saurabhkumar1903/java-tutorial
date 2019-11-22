package com.tutorial.thread.threadlocal;

import java.text.SimpleDateFormat;

public class MyThreadLocal implements Runnable {

	private SimpleDateFormat simpleDateFormat;

	public MyThreadLocal(SimpleDateFormat simpleDateFormat) {
		this.simpleDateFormat = simpleDateFormat;
	}

	public MyThreadLocal() {
	}

	/*
	 * private static final ThreadLocal<SimpleDateFormat> formatter = new
	 * ThreadLocal<SimpleDateFormat>() {
	 * 
	 * @Override protected SimpleDateFormat initialValue() { return new
	 * SimpleDateFormat("yyyyMMdd HHmm"); } };
	 */

	private static final ThreadLocal<SimpleDateFormat> formatter = ThreadLocal
			.withInitial(() -> new SimpleDateFormat("yyyyMMdd HHmm"));

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " DefaultPattern: " + formatter.get().toPattern());
		/*
		 * simpleDateFormat = new SimpleDateFormat();
		 * System.out.println("Changing Pattern to: " + simpleDateFormat.toPattern());
		 */

		formatter.set(new SimpleDateFormat());
		System.out.println(Thread.currentThread().getName() + " Changing Pattern to: " + formatter.get().toPattern());
	}

}
