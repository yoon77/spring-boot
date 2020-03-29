package io.msastudy.shc.springboot.service;

import java.util.Optional;

import io.msastudy.shc.springboot.domain.Book;

public interface BookService {

	Optional<Book> findById(Long Id);
}
