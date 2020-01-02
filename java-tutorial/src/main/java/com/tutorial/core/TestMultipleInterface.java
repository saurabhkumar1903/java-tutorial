package com.tutorial.core;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class TestMultipleInterface implements Interface1,Interface2 {

	@Override
	public void foo() {
System.out.println("Hello from Impl");		
	}
	
	public static void main(String[] args) {
		TestMultipleInterface test=new TestMultipleInterface();
		System.out.println(test instanceof Interface1);
		System.out.println(test instanceof Interface2);
		
		AbstractClass ab=new AbstractClass() {
			
			@Override
			public void fun() {
System.out.println("hello from impl");				
			}
		};
		
		Map<String, String> props = new HashMap<>();
		props.put("salary", "10000");
		props.put("city", "Bangalore");
		Stream.of(props).findAny().get();
		for(Entry<String,String> entry:props.entrySet())
		{
			System.out.println(entry.getKey());
		}
		
		Collection collection=new LinkedList<>();
	}

	@Override
	public void baz() {
		// TODO Auto-generated method stub
		
	}

}
