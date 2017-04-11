package com.practise.udemy.ds;

import java.util.Arrays;

public class CoutingSort {

	/**
	 * @param args
	 */

	int temp[] = new int[8];
	int temp1[] = new int[8];

	public static int a[] = { 1, 4, 1, 2, 7, 5, 2 };
	int sortedArry[] = new int[a.length];
	int countOfIndex = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoutingSort ss = new CoutingSort();
		ss.sort(a);
		// System.out.println("sorted strioing" + Arrays.toString(a));

	}
	private void sort(int[] a) {
		// couting the number of repeated values;
		for (int i = 0; i < a.length; ++i) {

			temp[a[i]] += 1;

		}
		System.out.println("__count of repitions__" + Arrays.toString(temp));

		// calculating the adjcent values
		/*
		 * for (int i = 1; i <temp.length; ++i) {
		 * 
		 * // temp[i]=temp[i-1]+temp[i];
		 * 
		 * temp[i]+=temp[i-1]; } System.out.println("__after adding__"
		 * +Arrays.toString(temp));
		 */
		
		for (int i = 0; i <= a.length; i++) {
			
			int count=temp[i];
					
					for(int j=0;j<count;j++){
						
						sortedArry[countOfIndex]=i;
						countOfIndex++;
					}
			
			
		}

		System.out.println("-sorted-" + Arrays.toString(sortedArry));

	}

}
