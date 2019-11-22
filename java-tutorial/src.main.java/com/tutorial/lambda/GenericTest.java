package com.tutorial.lambda;

import org.apache.commons.lang3.StringUtils;

interface Test<T> {
	T fun(T t);
}

public class GenericTest {

	public static String getOp(Test<String> test, String args) {
		return test.fun(args);
	}

	public static String strRev(String input) {
		return StringUtils.reverse(input);
	}

	public static void main(String[] args) {

		final String in = "Hello world.........!";
		final String out = getOp(GenericTest::strRev, in);
		System.out.println("Output:" + out);

	}

}
