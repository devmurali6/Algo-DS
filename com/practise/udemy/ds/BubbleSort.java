package com.practise.udemy.ds;

import java.util.Scanner;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		int noswap = 0;
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		for (int i = 0; i < n; i++) {

			int temp = 0;

			for (int j = 0; j < n - 1; j++) {
				// Swap adjacent elements if they are in decreasing order
				if (a[j] > a[j + 1]) {

					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

					noswap++;
				}
			}

			// If no elements were swapped during a traversal, array is sorted
			if (noswap == 0) {
				break;
			}

		}

		// display the array
		System.out.println("Array is sorted in " + noswap + " swaps.");
		System.out.println("First Element:" + a[0]);
		System.out.println("Last Element:" + a[n - 1]);

	}

}
