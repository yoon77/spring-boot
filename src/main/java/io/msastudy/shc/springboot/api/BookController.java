package io.msastudy.shc.springboot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;  


import io.msastudy.shc.springboot.domain.Book;
import io.msastudy.shc.springboot.service.BookService;

@RestController
//@RequestMapping("/books")
@RequestMapping(value = "/books")
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/{bookId}")
	//public ResponseEntity<Book> findById(Long bookId) {
	 public ResponseEntity findById(@PathVariable Long bookId){
		
		Book book = bookService.findById(bookId).orElseThrow(() -> new RuntimeException());
		return ResponseEntity.ok(book);
	}
	
}
