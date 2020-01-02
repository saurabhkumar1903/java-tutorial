package com.tutorial.core;

public class Parent {
	
	public static void fun()
	{
		System.out.println("InPArent");
	}
	public static void main(String[] args) {
		Child.fun();
		Parent parent=new Child();
		parent.fun();
		Child child=new Child();
		child.fun();
	}

}

class Child extends Parent
{
	public static void fun()
	{
		System.out.println("InChild");
	}
}
