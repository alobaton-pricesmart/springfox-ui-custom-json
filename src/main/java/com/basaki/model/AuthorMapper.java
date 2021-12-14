package com.basaki.model;

import org.mapstruct.Mapper;

import com.basaki.data.entity.Author;

@Mapper
public interface AuthorMapper {
	Author dtoToEntity(AuthorDTO dto);

	AuthorDTO entityToDTO(Author entity);
}
