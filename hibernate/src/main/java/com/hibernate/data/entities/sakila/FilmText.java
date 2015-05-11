package com.hibernate.data.entities.sakila;

import javax.persistence.*;

/**
 * Created by Alex on 5/10/2015.
 */
@Entity
@Access(AccessType.FIELD)
@Table(name="FILM_TEXT")
public class FilmText {
    @Column(name="FILM_ID")
    private int filmId;


    @Column(name="TITLE")
    private String title;

    @Column(name="DESCRIPTION")
    private String description;

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
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
