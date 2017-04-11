package com.practise.udemy.ds.assignment;

public class DuplicatesinString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String input="greata";
		 
		 boolean result=hasDuplicatChars(input);
		 
		 System.out.println("result"+result);
		 
	
		
	}

	public  static boolean hasDuplicatChars(String s){
		
		String input=s;
		
		boolean flag=false;
		
		int a[]=new int[26];
		  
		 for (int i = 0; i < s.length(); i++) {
			
			 int val=input.charAt(i)-'a';
			 
			 a[val]++;
			 
			 if(a[val]>1){
				 flag=true;
				 break;
			 } 
			 
		}
		
		
		return flag;
	}
	
	
}
