package com.tutorial.thread;

public class LoopingThread implements Runnable {

	private static int sum;
	private int i;

	public LoopingThread(int i) {
		this.i = i;
	}

	@Override
	public void run() {

		//System.out.println(i);
		sum=sum+i;
		System.out.println(Thread.currentThread().getName()+" : "+sum);
		//System.out.println(sum);

	}

}
