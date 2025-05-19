package com.sj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerliDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         
		Book b1 = new Book(1,"Starry Nights","Shobha Day",500);
	    FileOutputStream fos = new FileOutputStream("books");
	    try (ObjectOutputStream ois = new ObjectOutputStream(fos)) {
			ois.writeObject(b1);
		}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	}

}
