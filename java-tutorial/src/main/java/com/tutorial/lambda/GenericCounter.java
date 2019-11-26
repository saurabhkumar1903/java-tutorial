package com.tutorial.lambda;

interface countMatch<T> {
	int findCount(T[] ts, T t);
}

class MyArrayOps {
	static <T> int countMatching(T[] ts, T t) {
		int count = 0;
		for (final T t1 : ts) {
			if (t1.equals(t)) {
				count++;
			}
		}

		return count;
	}
}

public class GenericCounter {

	public static void main(String[] args) {
		final Integer[] vals = { 1, 2, 3, 4, 2, 3, 4, 4, 5 };
		final String[] strs = { "One", "Two", "Three", "Two" };
		int count;
		count = myOp(MyArrayOps::countMatching, vals, 4);
		System.out.println("vals contains " + count + " 4s");
		count = myOp(MyArrayOps::countMatching, strs, "Two");
		System.out.println("strs contains " + count + " Twos");
	}

	private static <T> int myOp(countMatch<T> match, T[] vals, T toCheck) {
		return match.findCount(vals, toCheck);
	}

}
