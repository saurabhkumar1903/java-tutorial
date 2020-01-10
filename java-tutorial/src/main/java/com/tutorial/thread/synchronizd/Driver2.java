package com.tutorial.thread.synchronizd;

class Driver2 {
	public static void main(String[] args) {
		Thread thread;
		for (int i = 0; i < 100; i++) {
			thread = new Thread(new ThreadRunner(), "Thread_" + i);
			thread.start();
		}

	}
}

class ThreadRunner implements Runnable {

	@Override
	public void run() {
		System.out.println("calling getInstance From Thread.." + Thread.currentThread().getName());
		MultiThreadSingleton instance = MultiThreadSingleton.getInstance();
		System.out.println("Got Instance..." + instance.hashCode() + " in " + Thread.currentThread().getName());
	}

}