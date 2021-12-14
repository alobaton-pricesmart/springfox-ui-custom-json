package com.basaki.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.basaki.data.entity.Book;
import com.basaki.model.BookDTO;
import com.basaki.service.BookService;

import javassist.NotFoundException;

/**
 * {@code BookController} exposes book service.
 * <p/>
 *
 * @author Indra Basak
 * @since 11/20/17
 */
@RestController
public class BookController {

	private BookService service;

	@Autowired
	public BookController(BookService service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/books")
	public Book create(@RequestBody BookDTO request) {
		return service.create(request);
	}

	@RequestMapping(method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE }, value = "/books/{id}")
	public Book read(@PathVariable("id") UUID id) throws NotFoundException {
		return service.read(id);
	}
}
