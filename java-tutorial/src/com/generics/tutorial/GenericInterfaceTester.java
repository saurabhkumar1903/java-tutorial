package com.generics.tutorial;

public class GenericInterfaceTester {
	public static void main(String[] args) {
		final Integer[] a = { 1, 2, 3 };
		final MinMax<Integer> minMaxI = new MinMaxImpl<>(a);
		System.out.println(minMaxI.max());
		System.out.println(minMaxI.min());

		final String[] s = { "1", "2", "3" };
		final MinMax<Integer> minMaxS = new MinMaxImpl<>(a);
		System.out.println(minMaxS.max());
		System.out.println(minMaxS.min());
	}

}
