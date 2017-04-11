package com.practise.udemy.ds;

import java.util.Arrays;

public class QuickSort1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a[]= {10,5,9,1,8,3};
		QuickSort1 Q=new QuickSort1();
		Q.sorting(a,0,a.length-1);
		System.out.println("sorted strioing" + Arrays.toString(a));

	}

	private void sorting(int[] a,int start, int end) {
		
		if(start<end){
			
			int pivot=parition(a,start,end);
			sorting(a,start,pivot-1);
			sorting(a,pivot+1,end);
		}
	}

	private int parition(int[] a, int start, int end) {
		
		int pivot=a[end];
		
		int i=start;
	
		
		for (int j = start; j < end-1; j++) {
			
			if(a[j]<=pivot){
				
				exchange(a,i,j);
						i++;
				
			}
		}
		
		exchange(a,i,end);
		return i;
	}	
	
	private void exchange(int a[],int m,int n){
		int temp=0;
		temp=a[m];
		a[m]=a[n];
		a[n]=temp;
	}
	
}
