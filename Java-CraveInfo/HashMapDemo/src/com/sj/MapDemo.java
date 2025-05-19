package com.sj;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book books[]= new Book[4];
	    books[0]= new Book(12,"Abstract Algebra","Murrey",1300);
	    books[1]= new Book(2,"Accidental P M","Sanjay Baru",1400);
	    books[2]= new Book(33,"Bitter Chocolate","Pinky Wirani",900);
	    books[3]= new Book(4,"The Airport","Agatha C",2300);
	    
	    HashMap<Integer,Book> bookMap = new HashMap<>();
	    bookMap.put(books[0].getBookId(), books[0]);
	    bookMap.put(books[1].getBookId(), books[1]);
	    bookMap.put(books[2].getBookId(), books[2]);
	    bookMap.put(books[3].getBookId(), books[3]);
	    bookMap.put(books[1].getBookId(), books[1]);
	    
	   // System.out.println(bookMap);
	    
	   // System.out.println(bookMap.get(3));
	    Set<Integer> bookIds =bookMap.keySet();
	    Collection<Book> bookValues = bookMap.values();
	    Iterator<Integer> idItr = bookIds.iterator();
	    Iterator<Book> valueItr = bookValues.iterator();
	    while(idItr.hasNext()&& valueItr.hasNext()) {
	    	System.out.print(idItr.next()+"-" +valueItr.next().getPrice());
	    }
	    System.out.println("");
	    
	    Set<Entry<Integer,Book>> bookEntries = bookMap.entrySet();
	    
	   Iterator<Entry<Integer, Book>> entryItr= bookEntries.iterator();
	    while(entryItr.hasNext()) {
	    	      Entry<Integer, Book> bookEntry =entryItr.next();
	    	System.out.println(bookEntry.getKey()+"-"+bookEntry.getValue().getAuthor());
	    }
	    
	    
	    TreeMap<Book, Float> sortedBooks = new TreeMap<>();
	    sortedBooks.put(books[0],books[0].getPrice());
	    sortedBooks.put(books[1],books[1].getPrice() );
	    sortedBooks.put(books[2],books[2].getPrice() );
	    
	    
	    Set<Entry<Book, Float>> sortedBookSet = sortedBooks.entrySet();
	    
	    Iterator<Entry<Book, Float>> itr = sortedBookSet.iterator();
	    
	    
	    while(itr.hasNext()) {
	    	Entry<Book, Float> bookEntry =itr.next();
	        System.out.println(	bookEntry.getKey().getBookId()+bookEntry.getValue());
	    }
	    
	}

}
