package com.movies.view.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movies.view.entities.Film;
import com.movies.view.repositories.FilmsRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Service
@Slf4j
public class FilmService {
    @Autowired
    private FilmsRepository filmsRepository;

    public Iterable<Film> getFilm(){
        return filmsRepository.findAll();
        }

}
