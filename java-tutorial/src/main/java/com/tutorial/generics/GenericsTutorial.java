package com.tutorial.generics;

public class GenericsTutorial {

	public static void main(String[] args) {
		final Integer inums[] = { 1, 2, 3, 4, 5 };
		final Generic<Integer> igeneric = new Generic<>(inums);
		final double v = igeneric.findAverage();
		System.out.println("iob average is " + v);
		final Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		final Generic<Double> dgeneric = new Generic<>(dnums);
		final double w = dgeneric.findAverage();
		System.out.println("dob average is " + w);
		igeneric.displayTypeObj();
		System.out.println(igeneric.averageChk(dgeneric));

		final Integer a[] = { 1, 2, 3 };
		final String x[] = { "1", "2" };
		System.out.println(isIn(1, a));
		System.out.println(isIn("1", x));
		new GenericConstructor(14).display();

	}

	static <T extends Comparable<T>, V extends T> boolean isIn(V v, T[] ts) {
		for (final T t : ts) {
			if (v.equals(t)) {
				return true;
			}
		}
		return false;
	}
}
