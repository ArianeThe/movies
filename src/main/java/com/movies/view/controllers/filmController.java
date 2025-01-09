package com.movies.view.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movies.view.entities.Film;
import com.movies.view.services.FilmService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping
public class filmController {
    @Autowired
    private FilmService filmService;

    /*Récupérer tous les films */
    @GetMapping("/entities/Film")
    public Iterable<Film> getFilm(){
    return filmService.getFilm();
    }
    
    
}
