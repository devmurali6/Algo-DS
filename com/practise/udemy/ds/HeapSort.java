package com.practise.udemy.ds;

public class HeapSort {

	/**
	 * @param args
	 */
	
	public static int[] tempArr=new int[5];
	public static int i=-1;
	public static int key=0;
	public static int left=(2*i)+1;
	public static int right=(2*i)+2;
	
	
	public void add(int data){
		
		
		if(isEmpty()){
			
			tempArr[++i]=data;
			
		}
		
		
		
		
			
	}
		
	
	
	
	
	public boolean isEmpty(){
		
		return i<0;

	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	HeapSort hp= new HeapSort();
	
	 hp.add(20);
	 hp.add(10);
	 hp.add(5);
	 hp.add(2);
	 
	 System.out.println("inserted data");
	 
	 for (int i = 0; i < tempArr.length; i++) {
		 
		 System.out.println("i--"+i+ "--values--" +tempArr[i]);
		
	}
	 
	
		
		

	}

}
