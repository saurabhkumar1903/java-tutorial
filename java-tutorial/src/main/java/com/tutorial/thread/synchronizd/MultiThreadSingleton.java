package com.tutorial.thread.synchronizd;

public class MultiThreadSingleton {

	private static MultiThreadSingleton multiThreadSingleton;

	public static MultiThreadSingleton getInstance() {
		System.out.println("get instance called from Thread..." + Thread.currentThread().getName());
		if (null == multiThreadSingleton) {
		synchronized (MultiThreadSingleton.class) {
			if (null == multiThreadSingleton) {
				System.out.println("Creating a new MultiThreadSingleton instance from Thread..."
						+ Thread.currentThread().getName());

				multiThreadSingleton = new MultiThreadSingleton();

			}
		}
		}
		return multiThreadSingleton;
	}

	private MultiThreadSingleton() {

	}
}
