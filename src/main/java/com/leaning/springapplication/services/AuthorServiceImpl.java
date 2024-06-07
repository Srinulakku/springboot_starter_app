package com.leaning.springapplication.services;

import com.leaning.springapplication.domain.Author;
import com.leaning.springapplication.repository.AuthorRepository;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorServiceImpl implements AuthorServices{
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> getAuthors() {
        return authorRepository.findAll();
    }
}
