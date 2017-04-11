package com.practise.udemy.ds.assignment;

import org.apache.commons.lang.builder.HashCodeBuilder;

 class Record{
	
	private Object key;
	private Object Value;
	
	public Record(Object key, Object Value){
		
		this.key=key;
		this.Value=Value;
	}
	public Object getKey() {
		return key;
	}
	public void setKey(Object key) {
		this.key = key;
	}
	public Object getValue() {
		return Value;
	}
	public void setValue(Object value) {
		Value = value;
	}
}


public class HastAssig {

    private static final int size=50;
    
    private Record[] table=new Record[size];

    
	private  boolean isEmpty(int slot) {
		
		return table[slot] == null;
	}
	
    public  void put(Object key,Object data){
    	
      int keyCode=key.hashCode();
      
      System.out.println("key code is" +keyCode);
      int step=0;
      int slot=hash(keyCode,step);
      
      while(!isEmpty(slot)){
    	  
    	  slot=hash(keyCode, ++step);
    	  
      }
      table[slot]=new Record(key, data);
      
    }
    
    public Record get(Object key){
    	
    	int  keyCode=key.hashCode();
    	int step=0;
    	int slot=hash(keyCode, step);
    	
    	while(table[slot]!=null && !table[slot].getKey().equals(key)){
    		
    		slot=hash(keyCode, ++step);
    	}
    	
       return table[slot];
    	
    }    
    
    
    public static int hash(int keyCode, int step){
    	
    	int hash=(keyCode % size);
    	int  finalhash=(((hash+1)%size) + step*((hash+2)%size))% size;
        System.out.println("final hascode " +finalhash);
        return finalhash;
    	
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HastAssig ha=new HastAssig();
		ha.put("4", "four");
		ha.put("4", "five");
		ha.put("6", "eight");
		ha.put("9", "nine");
		
	    Record result=ha.get("4");
		
	    System.out.println("result--"+ "key--" +result.getKey()+"Date--" +result.getValue());

	}

}
