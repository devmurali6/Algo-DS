package com.practise.udemy.ds;

import java.util.Arrays;

public class QuickSort {

	/**
	 * @param args
	 */
	
	public static void parition(int a[],int start,int end){
		
		int left=start;
		int right=end;
		int pivot=end;
		//int pivot=start+(end-start)/2;
	
		
		while(left<=right){
			
			while(a[left]<a[pivot]){
				left++;
			}
			while(a[right]>a[pivot]){
				right--;
			}
			
			if(left<=right){
				exchange(a,left,right);
				left++;
				right--;
			}
				
			
		}
		
		if(start<right){
			
			parition(a, start, right);
		}
		if(left<end){
			parition(a,left,end);
			
		}
		
		
		
		
	}
	
	
	
	private static void exchange(int[] a, int left, int right) {
		// TODO Auto-generated method stub
		
		int temp=0;
		
		temp=a[left];
		a[left]=a[right];
		a[right]=temp;
		
		
	}
	
	public static void sort(int[] a){
		
		if(a==null || a.length==0){
			return ;
			
		}
		parition(a,0,a.length-1);
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,5,9,1,8,3};
		
		QuickSort Q=new QuickSort();
         
		Q.sort(a);
		
		System.out.println("sorted strioing" + Arrays.toString(a));
		
		
	}




}
