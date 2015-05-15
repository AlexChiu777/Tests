package com.hibernate.data.entities.sakila;

import javax.persistence.*;

/**
 * Created by Alex on 5/13/2015.
 */
@Entity
@Table(name= "MARKET")
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="MARKET_ID")
    private long marketId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumns({
            @JoinColumn(name="CURRENCY_NAME", referencedColumnName = "NAME")
            ,@JoinColumn(name="COUNTRY_NAME", referencedColumnName = "COUNTRY_NAME")})
    private Currency currency;

    @Column(name="MARKET_NAME")
    private String marketName;

    public long getMarketId() {
        return marketId;
    }

    public void setMarketId(long marketId) {
        this.marketId = marketId;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }
}
