package com.practise.udemy.ds;

import java.util.Scanner;

public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		int j=0;
		int current=0;
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
         
		for (int i = 1; i < a.length; i++) {
			
			current=a[i];
          
			j=i;
			
			while(j>0 && current<a[j-1]){
				
				
				  a[j]=a[j-1];
				  j--;
						
			}
		
			a[j]=current;
			
		}
		
		
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]+" ");
		}
		
		
		
	}

}
