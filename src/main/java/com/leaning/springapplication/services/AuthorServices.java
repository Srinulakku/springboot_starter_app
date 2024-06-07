package com.leaning.springapplication.services;

import com.leaning.springapplication.domain.Author;

public interface AuthorServices
{
    Iterable<Author> getAuthors();
}
