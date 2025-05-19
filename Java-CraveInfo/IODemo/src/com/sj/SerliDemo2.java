package com.sj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerliDemo2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
         
		FileInputStream fis = new FileInputStream("books");
		try (ObjectInputStream ois = new ObjectInputStream(fis)) {
			   Book b1 = (Book) ois.readObject();
			   
			   System.out.println(b1);
			
		}
	    
	    
	    
	    
	    
	    
	
	}

}
