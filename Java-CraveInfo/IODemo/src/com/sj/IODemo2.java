package com.sj;

import java.io.BufferedInputStream;
import java.io.IOException;

public class IODemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
			BufferedInputStream bis =  new   BufferedInputStream(System.in);
	        char x ='a';
	        while(x!='z') {
	    	
				x = (char) bis.read();
				System.out.print(x);
			} 
		}
	    catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    
	
	
	
	
	
	}

}
