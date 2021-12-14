package com.basaki.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.basaki.model.AuthorMapper;
import com.basaki.model.AuthorMapperImpl;
import com.basaki.model.BookMapper;
import com.basaki.model.BookMapperImpl;

@Configuration
public class ApplicationConfiguration {

	@Bean
	public BookMapper bookMapper() {
		return new BookMapperImpl();
	}
	
	@Bean
	public AuthorMapper authorMapper() {
		return new AuthorMapperImpl();
	}

}
