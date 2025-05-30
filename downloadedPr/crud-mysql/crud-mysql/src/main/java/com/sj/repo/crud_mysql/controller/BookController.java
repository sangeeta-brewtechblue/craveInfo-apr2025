/**
 * 
 */
package com.sj.repo.crud_mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sj.repo.crud_mysql.model.Book;
import com.sj.repo.crud_mysql.service.BookService;

/**
 * @author sange
 *
 */

@RestController
@RequestMapping("/api")
public class BookController {
	@Autowired
	BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
	  return	bookService.getAllBooks();
	}
	
	@GetMapping("/books/{id}")
	public Book getBookById(@PathVariable int id) {
		System.out.println(id);
		return bookService.getBookById(id);
		
	}
	
	@PostMapping("/books")
	public Book addNewBook(@RequestBody Book book) {
		return bookService.addBook(book);
		
	}
	
	
	
	
	
	
	
	

}
