package com.hibernate.data.entities.sakila;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Alex on 5/10/2015.
 */
@Entity
@Access(AccessType.FIELD)
@Table(name="FILM_TEXT")
public class FilmText implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @OneToOne
    @JoinColumn(name="FILM_ID")
    private Film film;

    @Column(name="TITLE")
    private String title;

    @Column(name="DESCRIPTION")
    private String description;

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
