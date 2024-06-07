package com.leaning.springapplication.repository;

import com.leaning.springapplication.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book , Long> {
}
