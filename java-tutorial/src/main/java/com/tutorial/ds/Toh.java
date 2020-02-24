package com.tutorial.ds;

public class Toh {

	public static void main(String[] args) {
		toh(10, 'A', 'C', 'B');
	}

	public static void toh(int n, char source, char destination, char auxiliary) {
		// if just one box is there just move it from source to destinantion
		if (n == 1) {
			System.out.printf("Move %d from %c to %c \n", n, source, destination);
			return;
		} else {
			// step1 move n-1 box from source to auxiliary
			toh(n - 1, source, auxiliary, destination);
			// step2 move 1 from source to destination
			System.out.printf("Move %d from %c to %c \n", n, source, destination);

			// step 3 now we have to move n-1 boxes from auxiliary to destination
			toh(n - 1, auxiliary, destination, source);
		}
	}

}
