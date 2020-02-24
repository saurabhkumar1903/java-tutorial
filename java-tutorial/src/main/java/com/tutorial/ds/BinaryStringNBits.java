package com.tutorial.ds;

public class BinaryStringNBits {
	public static void main(String[] args) {
		int n = 3;
		int k=2;
		int A[] = new int[n];
//		binaryStringNBits(n);
//		BinaryStringNBits2ndWay(n, A);
		karryString(k,n, A);
	}

	public static void binaryStringNBits2ndWay(int n, int[] A) {
		System.out.println();
		if (n < 1) {
			for (int a : A)
				System.out.print(a);
		} else {
			A[n - 1] = 0;
			binaryStringNBits2ndWay(n - 1, A);
			A[n - 1] = 1;
			binaryStringNBits2ndWay(n - 1, A);
		}
	}

	public static void binaryStringNBits(int n) {
		for (int i = 0; i < 1 << n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) > 0)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}

	public static void karryString(int k,int n, int[] A) {
		if (n < 1)
			for (int a : A)
				System.out.print(a);
		else {
			for (int i = 0; i < k; i++) {
				A[n - 1] = i;
				karryString(k,n - 1, A);

			}
		}
		System.out.println();
	}

}
