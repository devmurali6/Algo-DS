package com.practise.udemy.ds;

import java.util.Arrays;

public class ShellSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a[] = { 10, 5, 9, 1, 8, 3, 2, 0,-1 };
		ShellSort Q = new ShellSort();
		Q.sort(a);
		System.out.println("---sorted strioing" + Arrays.toString(a));

	}

	private void sort(int[] a) {

		int h = 1;
		while (h < a.length / 3) {
			h = h * 3 + 1;
		}
		while (h >= 1) {
			for (int j = 0; j < a.length; j++) {

				doInsertSortwithGap(a,j,h);
			}

			h = (h - 1) / 3;
		}
	}

	private void doInsertSortwithGap(int[] a, int startInd, int h) {
		

		
		System.out.println("startInd"+startInd+"h values"+h);
		
		int i=startInd;
		
		 while(i<a.length ){ 
			 
		/*	 int temp=a[h];
			 a[h]=current;
			 a[j]=temp;*/
			 int temp=a[i];
			 int j=i-h;
			 
			       while(j>=0 && a[j]>=temp){
			    	   
			    	a[j+h]=a[j];   
			    	   j=j-h;
			    	   
			       }
			       a[j+h]=temp;
			       i=i+h;
			
	 
		 }
		 
		 
		 System.out.println("sorted strioing" + Arrays.toString(a));
		 
		
	
	}

}


