package com.tutorial.thread.producerconsumer;

public class Producer implements Runnable {

	private Message message;

	public Producer(Message message) {
		this.message = message;
	}

	@Override
	public void run() {

		while (true) {
			synchronized (message) {
				while (message.getCount() >= 10) {
					try {
						System.out.println("Producer waiting...");
						message.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				message.setCount(message.getCount() + 1);
				System.out.println("Produced:" + message.getCount());
				message.notify();

			}
		}
	}
}
