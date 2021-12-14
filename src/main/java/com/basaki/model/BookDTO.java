package com.basaki.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * {@code BookRequest} represents a response during book creation.
 * <p/>
 *
 * @author Indra Basak
 * @since 11/23/17
 */
@Data
public class BookDTO {

    private String title;

    private AuthorDTO author;

    @JsonCreator
    public BookDTO(@JsonProperty("title") String title,
            @JsonProperty("author") AuthorDTO author) {
        this.title = title;
        this.author = author;
    }  
    
}
