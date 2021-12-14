package com.basaki.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AuthorDTO {
	private String name;

    @JsonCreator
    public AuthorDTO(@JsonProperty("name") String name) {
        this.name = name;
    }
       
}
