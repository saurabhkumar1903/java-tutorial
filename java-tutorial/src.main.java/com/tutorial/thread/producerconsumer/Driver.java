package com.tutorial.thread.producerconsumer;

public class Driver {
	public static void main(String[] args) throws InterruptedException {
		Message message = new Message("Hello_", 0);

		Thread consumerThread = new Thread(new Consumer(message), "C1");

		Thread producerThread = new Thread(new Producer(message), "P1");

		consumerThread.start();
		producerThread.start();
	}

}
