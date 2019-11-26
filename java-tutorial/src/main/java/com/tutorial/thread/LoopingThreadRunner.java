package com.tutorial.thread;

public class LoopingThreadRunner {
	
	public static void main(String[] args) {
		String clients[]= {"192.168.0.1","192.168.0.2"};	
		for(int i=0;i<1000000000;i++)
		{
		Thread t=new Thread(new LoopingThread(i));
		t.start();
	//	t.
		
		/*new Thread(new Runnable() {
			
			@Override
			public void run() {
			System.out.println(i);	
			}
		});
		}*/
	}
	
	
	

}}
