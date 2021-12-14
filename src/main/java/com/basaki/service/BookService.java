package com.basaki.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basaki.data.entity.Author;
import com.basaki.data.entity.Book;
import com.basaki.data.repository.BookRepository;
import com.basaki.model.AuthorMapper;
import com.basaki.model.BookDTO;
import com.basaki.model.BookMapper;

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
	private BookMapper bookMapper;
	private AuthorMapper authorMapper;

	@Autowired
	public BookService(BookRepository repository, BookMapper bookMapper, AuthorMapper authorMapper) {
		this.repository = repository;
		this.bookMapper = bookMapper;
		this.authorMapper = authorMapper;
	}

	public Book create(BookDTO request) {
		Author author = authorMapper.dtoToEntity(request.getAuthor());
		Book book = bookMapper.dtoToEntity(request);
		book.setAuthor(author);

		return repository.save(book);

	}

	public Book read(UUID id) throws NotFoundException {
		return repository.findById(id).orElseThrow(() -> new NotFoundException("book not found"));
	}
}
