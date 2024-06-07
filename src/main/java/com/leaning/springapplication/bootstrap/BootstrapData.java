package com.leaning.springapplication.bootstrap;

import com.leaning.springapplication.domain.Author;
import com.leaning.springapplication.domain.Book;
import com.leaning.springapplication.domain.Publisher;
import com.leaning.springapplication.repository.AuthorRepository;
import com.leaning.springapplication.repository.BookRepository;
import com.leaning.springapplication.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    // this will do the autowiring

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author srinu = new Author();
        srinu.setFirstName("Srinu");
        srinu.setLastName("Lakku");

        Book book = new Book();
        book.setTitle("A Book for Coding");
        book.setIsbn("1720193");

        Author srinuSaved = authorRepository.save(srinu);
        Book bookSaved = bookRepository.save(book);

        Author author = new Author();
        author.setFirstName("ABC");
        author.setLastName("XYZ");

        Book book2 = new Book();
        book2.setTitle("Spring for Beginners");
        book2.setIsbn("13139173");

        Author authorSaved = authorRepository.save(author);
        Book book2Saved = bookRepository.save(book2);

        srinuSaved.getBooks().add(bookSaved);
        authorSaved.getBooks().add(book2Saved);
        bookSaved.getAuthors().add(srinuSaved);
        book2Saved.getAuthors().add(authorSaved);

        Publisher publisher = new Publisher();
        publisher.setPublisherName("Srinu Publications");
        publisher.setCity("Nellore");
        publisher.setAddress("ABC");
        publisher.setState("Andhra Pradesh");
        publisher.setZip(520012);
        Publisher publisherSaved = publisherRepository.save(publisher);

        bookSaved.setPublisher(publisherSaved);
        book2Saved.setPublisher(publisherSaved);

        authorRepository.save(srinuSaved);
        authorRepository.save(authorSaved);

        bookRepository.save(bookSaved);
        bookRepository.save(book2Saved);


        System.out.println("Hey in Bootstrap");
        System.out.println("Author count "+authorRepository.count());
        System.out.println("Book count "+bookRepository.count());



        System.out.println("Saved Publisher "+publisherRepository.count());



    }
}
