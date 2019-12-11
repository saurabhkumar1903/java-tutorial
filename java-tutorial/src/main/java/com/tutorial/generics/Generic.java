package com.tutorial.generics;

public class Generic<T extends Number> {
	T[] obj;

	public Generic(T[] obj) {
		this.obj = obj;
	}

	void displayTypeObj() {
		System.out.println(obj.getClass().getName());
	}

	double findAverage() {
		double sum = 0.0;
		for (final T t : obj) {
			sum += t.doubleValue();
		}
		return sum;
	}

	boolean averageChk(Generic<?> obj) {
		return findAverage() == obj.findAverage();

	}

}
