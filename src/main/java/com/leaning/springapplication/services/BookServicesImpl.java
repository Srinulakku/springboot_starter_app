package com.leaning.springapplication.services;

import com.leaning.springapplication.domain.Book;
import com.leaning.springapplication.repository.BookRepository;
import org.springframework.stereotype.Component;

@Component
public class BookServicesImpl implements Bookservices{

    private final BookRepository bookRepository;

    public BookServicesImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
