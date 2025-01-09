package com.movies.view.repositories;

import org.springframework.stereotype.Repository;
import com.movies.view.entities.Film;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface FilmsRepository extends CrudRepository<Film, Integer>{
    
}
