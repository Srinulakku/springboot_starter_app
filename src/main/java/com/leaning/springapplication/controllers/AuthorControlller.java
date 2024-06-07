package com.leaning.springapplication.controllers;

import com.leaning.springapplication.services.AuthorServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorControlller {
    private final AuthorServices authorServices;

    public AuthorControlller(AuthorServices authorServices) {
        this.authorServices = authorServices;
    }

    @GetMapping("/authors")
    public String getAuthors(Model model){
        model.addAttribute("authors", authorServices.getAuthors());

        return "authors";
    }
}
