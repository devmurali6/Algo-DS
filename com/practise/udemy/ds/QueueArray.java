package com.practise.udemy.ds;

public class QueueArray {

	/**
	 * @param args
	 */
	public static int items[]= new int[5];
	public static int head=-1;
	public static int tail=-1;
	public int numitems=0;
	
	
	
	public boolean isEmpty(){
		return numitems==0;
	}
	
	public boolean isFull(){
		return numitems==items.length;
	}
	
	
	public void enqueue(int data){
		
		if(isFull()){
			System.out.println("full");
		}
	      if(tail==items.length-1){
	    	  tail=-1;
	      }
	      items[++tail]=data;

	}
	
	public int dequeue(){
		
		if(isEmpty()){
			System.out.println("no elements to remove");
		}
		
		if(head==items.length-1){
			head=-1;
		}
		numitems--;
		return items[++head];
	}
	
	public int peek() {
		return items[head+1];
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    /*QueueArray st=new QueueArray();
	     st.enqueue(5);
	     st.enqueue(10);
	     st.enqueue(15);
	     st.enqueue(20);
	     st.enqueue(25);
	    // st.enqueue(30);

		for (int i = 0; i < items.length; i++) {
			
			System.out.println("values of stack" +items[i]);
		}
		*/
		QueueArray q = new QueueArray();
		System.out.println(q.isEmpty());
		q.enqueue(5);
		q.enqueue(4);
		q.enqueue(6);
		q.enqueue(10);
		q.enqueue(46);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(2);
		q.enqueue(4);
		q.enqueue(6);
		q.enqueue(8);
		q.enqueue(10);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(11);
		q.enqueue(12);
		q.enqueue(13);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		
		
	}

}
