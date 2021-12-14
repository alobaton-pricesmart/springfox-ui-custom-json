CREATE TABLE author
(
  id                    BINARY(16) PRIMARY KEY,
  name                  VARCHAR(32) NOT NULL
);

CREATE TABLE book
(
  id                    BINARY(16) PRIMARY KEY,
  title                 VARCHAR(32) NOT NULL,
  author_id             BINARY(16) NOT NULL,
  CONSTRAINT author_fk FOREIGN KEY (author_id) REFERENCES author(id)
);

