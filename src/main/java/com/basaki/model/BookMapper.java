package com.basaki.model;

import org.mapstruct.Mapper;

import com.basaki.data.entity.Book;

@Mapper
public interface BookMapper {
	Book dtoToEntity(BookDTO dto);

	BookDTO entityToDTO(Book entity);
}
