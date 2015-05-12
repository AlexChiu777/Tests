package com.hibernate.data.entities.sakila;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Alex on 5/10/2015.
 */
@Entity
@Access(AccessType.FIELD)
@Table(name="INVENTORY")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="INVENTORY_ID")
    private int inventoryId;

    @OneToMany
    @JoinColumn(name="FILM_ID")
    private List<Film> films;

    @OneToOne
    @JoinColumn(name="STORE_ID")
    private Store store;

    @Column(name="LAST_UPDATE")
    private Timestamp lastUpdate;

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
