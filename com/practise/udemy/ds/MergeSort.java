package com.practise.udemy.ds;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*	Scanner in = new Scanner(System.in);
		int n = in.nextInt();*/
		//int a[] = new int[n];
		
		int a[]= {2,3,6,5};

		/*for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}*/
		
		System.out.println(a.length);
		
		mergeSort(a,0,a.length-1);
		
		System.out.println("Sorted list is" + Arrays.toString(a));
			
		
	}
	
	public static  void mergeSort(int a[],int start,int end){
		
		if(start <end){
			
			int middle =(int) Math.floor((start+end)/2);
			mergeSort(a,start,middle);
			System.out.println("mersort --1--- start-- middle---" +start+"--" +middle );
			mergeSort(a,middle+1,end);
			System.out.println("mersort --2 ---middle-- end---" + (middle+1) + "--" +end );
			merge(a,start,middle,end);
			System.out.println("****** merge called ******************");
		}
		
	}	
		public static void merge(int a[],int start,int middle,int end){
			
			
			System.out.println("merge values are--" +a.length + "started valu--" +start+"middle value--" +middle+"end value--"+end);
			
			int n1=middle-start+1;
			int n2=end-middle;
			
			int left[]=new int[n1];
			int right[]=new int[n2];
			
			for (int i = 0; i < left.length; i++) {
				left[i]=a[start+i];
				
			}
			
			for (int j = 0; j < right.length; j++) {
				
				right[j]=a[middle+1+j];
			}
			
			int i=0,j=0;
			
			for (int k =start; k <=end; k++) {
				
				if(  j>=right.length || (i<left.length && left[i]<=right[j])) {
					a[k]=left[i];
					i++;
				}
				else{
					
					a[k]=right[j];
					j++;
					
				}	
			}
			
		}
		

}
