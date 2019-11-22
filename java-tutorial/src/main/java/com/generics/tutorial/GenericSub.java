package com.generics.tutorial;

public class GenericSub<T extends Number> {

	T t;

	public <U> GenericSub(T t, U u) {
		this.t = t;
	}

	void display() {
		System.out.println(t);
	}

}
