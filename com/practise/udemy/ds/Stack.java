package com.practise.udemy.ds;

public class Stack {

	/**
	 * @param args
	 * @return 
	 */
	
	public static int internalArr[]= new int[5];
	public static int top=-1;

	
	public boolean isEmpty(){
	
		return top<0;
	}
	
	public void push(int data){
		
		System.out.println("**" +internalArr.length);
		
		if(top==internalArr.length-1){
			System.out.println("Stack is full");	
		}
		else{
	 
			 ++top;
			internalArr[top]=data;
		}
	}
	
	public int pop(){
		

		if(isEmpty()){
			System.out.println("Stack is empty nthng to peek");	
		}
	
		;
		return internalArr[top--];
		
		
	}
	
	public int peek(){
		
		if(isEmpty()){
			System.out.println("Stack is empty nthng to peek");	
		}
	
		return internalArr[top];
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stack st=new Stack();
		st.push(20);
		st.push(10);
		int result=st.peek();
		System.out.println("Peek values" +result);
		int popItem=st.pop();
		int popItem2=st.pop();
		System.out.println("pop values" +popItem+ "2nd--" +popItem2);
		st.push(30);
		st.push(45);
		
		
		
		for (int i = 0; i < internalArr.length; i++) {
			
			System.out.println("values of stack" +internalArr[i]);
		}
	
		
		
	
	}

}
