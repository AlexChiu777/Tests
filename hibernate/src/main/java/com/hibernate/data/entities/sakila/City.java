package com.hibernate.data.entities.sakila;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 5/7/2015.
 */
@Entity
@Table(name="CITY")
@Access(AccessType.FIELD)
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="CITY_ID")
    private int cityId;

    @Column(name="CITY")
    private String city;

    @ManyToOne
    @JoinColumn(name="COUNTRY_ID", updatable = false, nullable = false)
    private Country country;

    @Column(name="LAST_UPDATE")
    private Timestamp lastUpdatedTimestamp;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "city")
    private List<Address> addresses = new ArrayList<Address>();

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Timestamp getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }

    public void setLastUpdatedTimestamp(Timestamp lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
