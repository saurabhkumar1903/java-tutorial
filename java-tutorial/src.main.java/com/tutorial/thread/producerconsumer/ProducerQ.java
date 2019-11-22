package com.tutorial.thread.producerconsumer;

import java.util.Queue;
import java.util.Random;

/**
 * Producer Thread will keep producing values for Consumer.
 * 
 * It will use wait() method when Queue is full and use notify() method to send
 * notification to Consumer Thread.
 * 
 * @author CodePumpkin
 *
 */
class ProducerQ implements Runnable {
	private final Queue sharedQ;
	private int maxSize;

	public ProducerQ(Queue sharedQ, int maxSize) {
		this.sharedQ = sharedQ;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {

		while (true) {
			synchronized (sharedQ) {
				while (sharedQ.size() == maxSize) {
					try {
						System.out.println("Queue is full");
						sharedQ.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
				Random random = new Random();
				int number = random.nextInt(100);
				System.out.println("Producing value " + number);
				sharedQ.add(number);
				sharedQ.notify();

			}

		}
	}
}