package com.hibernate.data.entities.sakila;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Alex on 5/10/2015.
 */
@Entity
@Access(AccessType.FIELD)
@Table(name="FILM_ACTOR")
public class FilmActor {
    /*@Id
    @ManyToMany
    @JoinColumn(name="ACTOR_ID")
    private List<Actor> actors;

    @Id
    @ManyToMany
    @JoinColumn(name="FILM_ID")
    private List<Film> films;

    @Column(name="LAST_UPDATE")
    private Timestamp lastUpdate;

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }*/
}
