package com.tutorial.generics;

public class RawTesterDriver {
	public static void main(String[] args) {
		RawTest rawTestS = new RawTest("s");
		rawTestS.display();

		final RawTest rawTestI = new RawTest(1);
		rawTestI.display();

		rawTestS = rawTestI;
		final Integer[] test = { 1, 2 };
		final NonGenSubClass<Integer, String> generic = new NonGenSubClass<>(test, "one");
		generic.display();
	}
}
