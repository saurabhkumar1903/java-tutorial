package com.tutorial.ds;

public class RecursiveSortChecker {
	public static void main(String[] args) {
		int[] a = { -5, -2, 3,  0, 5 };
		int result = checkSorted(a, 0, a.length);
		System.out.println(result);
	}

	private static int checkSorted(int[] a, int i, int length) {
		if (i == length - 1) {
			return 1;

		} else {
			if (a[i] > a[i + 1]) {
				return 0;

			} else {
				return checkSorted(a, i + 1, length);
			}

		}

	}

}
