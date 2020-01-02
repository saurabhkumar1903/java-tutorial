package com.tutorial.core;

public interface Interface3 extends Interface2{
	public default void bar() {
		System.out.println("hello");
	}

}


	
class Test2 implements Interface3
{

	@Override
	public void baz() {
		// TODO Auto-generated method stub
		
	}
	
}
