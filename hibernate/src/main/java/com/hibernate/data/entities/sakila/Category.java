package com.hibernate.data.entities.sakila;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Alex on 5/7/2015.
 */
@Entity
@Access(AccessType.FIELD)
@Table(name = "CATEGORY")
public class Category implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CATEGORY_ID")
    private int categoryId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LAST_UPDATE")
    private Timestamp lastUpdate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "CATEGORY_ID")
    private List<FilmCategory> filmCategories;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public List<FilmCategory> getFilmCategories() {
        return filmCategories;
    }

    public void setFilmCategories(List<FilmCategory> filmCategories) {
        this.filmCategories = filmCategories;
    }
}
