package com.tutorial.generics;

public class RawTest<T> {
	T t;

	public RawTest(T t) {
		this.t = t;
	}

	void display()
	{
		System.out.println(t);
	}
}


