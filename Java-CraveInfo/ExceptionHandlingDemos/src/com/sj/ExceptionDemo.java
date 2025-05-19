package com.sj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         		 
	 try {
			 System.out.println("Start of try block");
	         System.out.println("Division:"+(10/1));
	         System.out.println("End of try block");
	             
		 }      
	     catch(RuntimeException e) {
		 System.out.println("Can not divide by zero");
	     }
	     finally{
	    	  System.out.println("Finally gets executed in either of the cases");
	     }
	     
	     System.out.println("Some more code in try block ");
	
	
	}

}
