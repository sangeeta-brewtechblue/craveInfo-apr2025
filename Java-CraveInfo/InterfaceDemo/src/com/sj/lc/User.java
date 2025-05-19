package com.sj.lc;

public class User {
	Calculator calc;
	
	     
	  
	public Calculator getCalc() {
		return calc;
	}



	public void setCalc(Calculator calc) {
		this.calc = calc;
	}



		public void invokeFindSqrrt(int s) {
	    	     
	    	  System.out.println( calc.findSqrt(s));
	    	      
	      }

	
}
