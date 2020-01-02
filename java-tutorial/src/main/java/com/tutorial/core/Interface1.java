package com.tutorial.core;

public interface Interface1 extends Interface2 {
	
	 int x=9;
	public void foo();
	
	public static void main(String[] args) {
		Interface2 interface2 = null;
		Parent p=new Parent();
		
		System.out.println("hello");
		System.out.println(interface2 instanceof Interface2);

		System.out.println(p instanceof Parent);
	}

}
