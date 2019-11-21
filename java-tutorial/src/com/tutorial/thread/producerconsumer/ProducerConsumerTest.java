package com.tutorial.thread.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Simple Java Program to test Producer Consumer Design Pattern using wait,
 * notify and notifyAll() methods
 *
 * @author CodePumpkin
 *
 */
public class ProducerConsumerTest {

	public static void main(String[] args) throws InterruptedException {

		final Queue sharedQ = new LinkedList<Integer>();

		Thread consumerThread = new Thread(new ConsumerQ(sharedQ, 4), "CONSUMER");
		Thread producerThread = new Thread(new ProducerQ(sharedQ, 4), "PRODUCER");

		producerThread.start();
		consumerThread.start();

		producerThread.join();

	}

}
