package com.tutorial.ds;

public class InsertionSort {

	public static void main(String[] args) {
		final int a[] = { 2, -1, 0, 67, -9, 56, 1, 20 };
		System.out.println("Before sorting...");
		display(a);
		// insertionSort(a);
		// mergeSort(a);
		quickSort(a, 0, 8);
		System.out.println("After sorting...");
		display(a);
	}

	private static void quickSort(int[] a, int start, int end) {

		if (end - start < 2) {
			return;
		}
		final int pivot = findPivot(a);
		quickSort(a, start, pivot - 1);
		quickSort(a, pivot + 1, end);
	}

	private static int findPivot(int[] a) {
		int pivotIndex = a.length - 1;
		final int pivotElement = a[pivotIndex];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < pivotElement) {
				swap(a, i, pivotIndex);
				pivotIndex = i;
			}
		}
		swap(a, pivotIndex, a.length - 1);
		return pivotIndex;
	}

	private static void display(int[] a) {

		for (final int x : a) {
			System.out.println(x);
		}
	}

	private static void insertionSort(int[] a) {

		int sortedIndex = a.length - 1;
		int pos = 0;
		int max = a[0];
		while (sortedIndex != 0) {
			pos = 0;
			max = a[0];
			for (int j = 0; j <= sortedIndex; j++) {
				if (a[j] > max) {
					pos = j;
					max = a[j];
				}
			}
			swap(a, sortedIndex, pos);
			sortedIndex--;
		}

	}

	private static void mergeSort(int[] a) {
		final int length = a.length;
		if (length < 2) {
			return;
		}
		final int mid = length / 2;
		int i;
		final int[] left = new int[mid];

		for (i = 0; i < mid; i++) {
			left[i] = a[i];
		}

		final int[] right = new int[length - mid];
		for (int j = i; j < length; j++) {
			right[j - i] = a[j];
		}

		mergeSort(left);
		mergeSort(right);
		merge(a, left, right);

	}

	private static void merge(int[] a, int[] left, int[] right) {
		final int lenLeft = left.length;
		final int lenRight = right.length;
		int temp = 0, i, j;
		for (i = 0, j = 0; i < lenLeft && j < lenRight;) {
			if (left[i] < right[j]) {
				a[temp++] = left[i++];
			} else {
				a[temp++] = right[j++];
			}

		}
		while (i < lenLeft) {
			a[temp++] = left[i++];
		}
		while (j < lenRight) {
			a[temp++] = right[j++];
		}

	}

	private static void swap(int[] a, int sortedIndex, int pos) {

		System.out.println("Swapping " + a[sortedIndex] + " and" + a[pos]);
		final int temp = a[sortedIndex];
		a[sortedIndex] = a[pos];
		a[pos] = temp;
	}

}
