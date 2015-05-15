package com.hibernate.data.entities.sakila;

import javax.persistence.*;

/**
 * Created by Alex on 5/13/2015.
 */
@Entity
@IdClass(CurrencyId.class)
public class Currency {
    @Id
    @Column(name="NAME")
    private String name;

    @Id
    @Column(name="COUNTRY_NAME")
    private String countryName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
