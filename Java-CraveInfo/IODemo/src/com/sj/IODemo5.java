package com.sj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	    FileInputStream fis = new FileInputStream("MyFile");
	    FileOutputStream fos = new FileOutputStream("File2");
	    int x =0;
	    while(x!= -1) {
	    	x = fis.read();
	    	fos.write((char)x);
	    	
	    }
	    
	    FileInputStream fis1 = new FileInputStream("File2");
	    int i = 0;
	    while(i != -1) {
	    	 i=fis1.read();
	    	 System.out.print((char)i);
	    }
	
	
	}

}
