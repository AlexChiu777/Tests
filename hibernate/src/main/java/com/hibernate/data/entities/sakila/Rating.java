package com.hibernate.data.entities.sakila;

/**
 * Created by Alex on 5/10/2015.
 */
public enum Rating {
    RATING_G("G"), RATING_PG("PG"), RATING_PG_13("PG-13"), RATING_R("R"), RATING_NC_17("NC-17");

    private Rating(String ratingCode) {
        this.ratingCode = ratingCode;
    }

    private String ratingCode;

    public String getRatingCode() {
        return ratingCode;
    }
}
