package com.basaki.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basaki.data.entity.Book;
import com.basaki.data.repository.BookRepository;
import com.basaki.model.BookRequest;

import javassist.NotFoundException;

/**
 * {@code BookService} provides CRUD functioanality on book.
 * <p/>
 *
 * @author Indra Basak
 * @since 11/20/17
 */
@Service
public class BookService {

	private BookRepository repository;

	@Autowired
	public BookService(BookRepository repository) {
		this.repository = repository;
	}

	public Book create(BookRequest request) {
		Book entity = new Book();
		entity.setTitle(request.getTitle());
		entity.setAuthor(request.getAuthor());

		return repository.save(entity);

	}

	public Book read(UUID id) throws NotFoundException {
		return repository.findById(id).orElseThrow(() -> new NotFoundException("book not found"));
	}
}
