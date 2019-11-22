package com.tutorial.thread.producerconsumer;

public class Consumer implements Runnable {

	private Message message;

	public Consumer(Message message) {
		this.message = message;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (message) {

				while (message.getCount() < 1) {
					try {
						System.out.println("Consumer Waiting...");
						message.wait();
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}

				System.out.println("Consumed:" + message.getCount());
				message.setCount(message.getCount() - 1);
				message.notify();
			}

		}
	}
}
