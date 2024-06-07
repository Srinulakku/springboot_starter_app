package com.leaning.springapplication.repository;

import com.leaning.springapplication.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
