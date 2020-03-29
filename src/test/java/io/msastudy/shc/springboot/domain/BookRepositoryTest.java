package io.msastudy.shc.springboot.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


@DataJpaTest
public class BookRepositoryTest {

	@Autowired
	BookRepository repository;
	
	@Test
	public void testSave() {
		Book book = new Book();
		book.setName("boot-spring-boot");
		book.setIsbn10("0123456789");
		book.setIsbn13("0123456789012");
		
		assertThat(book.isNew()).isTrue();
	}
}
