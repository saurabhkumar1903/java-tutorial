package com.tutorial.core;

public class InstanceOf {
	public static void main(String[] args) {
		String s = null;
		Integer integer=new Integer(5);
		if (s instanceof java.lang.String)
			System.out.println("instanceof java.lang.String");
		System.out.println(integer instanceof java.lang.Integer);
		InstanceOf instanceOf=new InstanceOf();
		if(instanceOf instanceof InstanceOf)
			System.out.println(true);
	}

}
