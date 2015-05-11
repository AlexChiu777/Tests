package com.hibernate.data.entities.sakila;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Alex on 5/7/2015.
 */
@Entity
@Access(AccessType.FIELD)
@Table(name = "FILM_CATEGORY")
public class FilmCategory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="FILM_ID")
    private int filmId;

    @Column(name = "LAST_UPDATE")
    private Timestamp lastUpdate;

    @Id
    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID", nullable = false, updatable = false, insertable = false)
    private Category category;

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FilmCategory{" +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
