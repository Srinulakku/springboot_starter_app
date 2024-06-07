package com.leaning.springapplication.controllers;

import com.leaning.springapplication.services.BookServicesImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    private final BookServicesImpl bookServices;

    public BookController(BookServicesImpl bookServices) {
        this.bookServices = bookServices;
    }

    @RequestMapping("/books")
    public String findAll(Model model){
        System.out.println(bookServices.findAll());
        model.addAttribute("books",bookServices.findAll());

        return "books";
    }
}
