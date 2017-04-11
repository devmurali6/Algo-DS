package com.practise.udemy.ds.assignment;

public class Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input1="abcd";
		String input2="abcdcde";
		
		int count=0;
		
		  int[] freq = new int[26];
	        for (char c : input1.toCharArray()) {
	        	freq[c - 'a']++;
	                	
	        }
	        for (char c : input2.toCharArray()) {
	        	freq[c - 'a']--;
	                	
	        }
	        
		  for (int i : freq) {
			
			  count +=Math.abs(i);
		}
		
		  if(count==0){
			 System.out.println("success");
			 
		  }
		  else{
			  System.out.println("fails");
		  }
		
	}

}
