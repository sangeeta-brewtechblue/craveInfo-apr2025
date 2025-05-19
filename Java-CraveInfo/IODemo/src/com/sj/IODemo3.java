package com.sj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IODemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         BufferedReader reader = new BufferedReader
        		 (new InputStreamReader(System.in));
           char x ='a';
	        while(x!='z') {
	    	
			try {
					x =  (char) reader.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print(x);
			} 
	
	
	}

}
