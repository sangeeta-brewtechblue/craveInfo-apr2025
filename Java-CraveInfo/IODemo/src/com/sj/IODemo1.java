package com.sj;

import java.io.IOException;

public class IODemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	                try {
	                	
						char c = 'a';
						while(c!='z')
						{
							 c =	(char) System.in.read();
						     System.out.print(c);
						 } 
						}catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	
	
	
	
	}

}
