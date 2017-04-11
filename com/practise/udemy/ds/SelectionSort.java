package com.practise.udemy.ds;

import java.util.Scanner;


/*will first find the min values in whole list and compare it with position and swap it*/

public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		int minIndex=0;
		int noswap = 0;
		int temp=0;
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		for (int i = 0; i < n-1; i++) {

		     minIndex=i;

			for (int j = i+1; j <n-1; j++) {
				
				// Swap adjacent elements if they are in decreasing order
				if (a[j] < a[i]) {
					
					minIndex=j;

				}
			}
			
			if(minIndex!=i){
				
				temp = a[minIndex];
				a[minIndex] = a[i];
				a[i] = temp;
				
			}

		}
		
		
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]+" ");
		}
	

	}



}
