package com.ps.gc;

public class GCSample {

	 public static void main(String[] args) throws InterruptedException 
	    { 
		 GCSample t1 = new GCSample(); 
		 GCSample t2 = new GCSample(); 
	          
	        // Nullifying the reference variable 
	        t1 = null; 
	          
	        // requesting JVM for running Garbage Collector 
	        System.gc(); 
	          
	        // Nullifying the reference variable 
	        t2 = null; 
	          
	        // requesting JVM for running Garbage Collector 
	        Runtime.getRuntime().gc(); 
	        int f = -1000000;
	        while(f<100000)
	        	f++;
	      System.out.println("Method end");
	    } 
	      
	    @Override
	    // finalize method is called on object once  
	    // before garbage collecting it 
	    protected void finalize() throws Throwable 
	    { 
	        System.out.println("Garbage collector called"); 
	        System.out.println("Object garbage collected : " + this); 
	    } 
	} 
