package com.leaning.springapplication.services;

import com.leaning.springapplication.domain.Book;

public interface Bookservices {

    Iterable<Book> findAll();
}
