package com.tutorial.generics;

public class GenericConstructor {
	Double val;

	public <T extends Number> GenericConstructor(T val) {
		super();
		this.val = val.doubleValue();
	}

	public void display() {
		System.out.println(val);
	}

}
