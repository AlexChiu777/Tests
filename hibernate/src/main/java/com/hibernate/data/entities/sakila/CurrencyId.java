package com.hibernate.data.entities.sakila;

import java.io.Serializable;

/**
 * Created by Alex on 5/13/2015.
 */
@SuppressWarnings("serial")
public class CurrencyId implements Serializable{
    private String name;
    private String countryName;

    public CurrencyId() {
    }

    public CurrencyId(String name, String countryName) {
        this.countryName = countryName;
        this.name = name;
    }

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
