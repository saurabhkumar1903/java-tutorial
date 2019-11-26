package com.tutorial.thread.producerconsumer;

import java.util.Queue;

/**
 * Consumer Thread will consumer values form shared queue.
 * 
 * It will use wait() method to wait if queue is empty.
 * 
 * It will also use notify method to send notification to producer thread after
 * consuming values from queue.
 * 
 * @author CodePumpkin
 *
 */
class ConsumerQ implements Runnable {
	private final Queue sharedQ;
	private int maxSize;

	public ConsumerQ(Queue sharedQ, int maxSize) {
		this.sharedQ = sharedQ;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (sharedQ) {
				while (sharedQ.isEmpty()) {
					try {
						System.out.println("Que is Empty");
						sharedQ.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				int number = (int) sharedQ.poll();
				System.out.println("removing Element " + number);
				sharedQ.notify();

			}
		}
	}

}