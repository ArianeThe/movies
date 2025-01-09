package com.movies.view.entities;


import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Transient;

@Entity
@Getter
@Setter
@Table(name= "films")
public class Film implements Serializable{

    @Id
    @Transient
    @Column(name="no_film")
    @GeneratedValue(generator = "NO_FRAIS",strategy = GenerationType.SEQUENCE)
    private int no_film;

    @Column(name="titre")
    private String titre;


    @Column(name="annee")
    private String annee;

    @Column(name="genre")
    private String genre;

    @Column(name="realisateur")
    private String realisateur;

    @Column(name="synopsis")
    private String synopsis;

    @Column(name="desccritpion")
    private String description;

    @Column(name="affiche_url")
    private String affiche;
    
    
}
