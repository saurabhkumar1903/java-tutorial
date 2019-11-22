package com.tutorial.thread.synchronizd;

class HashMapProcessor implements Runnable {

	private String[] strArr = null;

	public HashMapProcessor(String[] m) {
		this.strArr = m;
	}

	@Override
	public void run() {
		processArr(Thread.currentThread().getName());
	}

	public String[] getMap() {
		return strArr;
	}

	private void processArr(String name) {
		for (int i = 0; i < strArr.length; i++) {
			// process data and append thread name
			processSomething(i);
			addThreadName(i, name);
		}
	}

	private void addThreadName(int i, String name) {
		//System.out.println("Thread:"+name +"read value :"+strArr[i]);
		synchronized (strArr) {
			strArr[i] = strArr[i] + ":" + name;	
		}
		
	}

	private void processSomething(int index) {
		// processing some job
		try {
			Thread.sleep(index * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}