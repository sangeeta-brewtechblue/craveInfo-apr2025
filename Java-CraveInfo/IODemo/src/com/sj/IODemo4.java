package com.sj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IODemo4 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

	      FileOutputStream fos = new FileOutputStream("MyFile");
	      BufferedReader reader = new BufferedReader
	        		 (new InputStreamReader(System.in));
	           char x ='a';
		        while(x!='z') {
		    	
				  try {
						x =  (char) reader.read();
						fos.write(x);
						
				  	} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				} 
	
	
	
	}

}
