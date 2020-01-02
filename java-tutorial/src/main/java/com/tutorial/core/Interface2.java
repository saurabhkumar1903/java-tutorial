package com.tutorial.core;

public interface Interface2 {
	public default void foo() {
		System.out.println("hello");
	}

	public void baz();

}
