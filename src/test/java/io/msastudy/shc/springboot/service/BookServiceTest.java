package io.msastudy.shc.springboot.service;

import java.util.function.Supplier;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;


@SpringBootTest(webEnvironment=WebEnvironment.NONE)
public class BookServiceTest {
	

	@Autowired
	BookService bookService;
	
	@Test
	public void testFIndById() {
		Long id = 1L;
		bookService.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
	}
}
