package com.tutorial.core;

public interface Interface2 {
	public default void foo() {
		System.out.println("hello");
	}

	public void baz();
	
	public static void main(String[] args) {
		System.out.println("main in interface");
	}

}
