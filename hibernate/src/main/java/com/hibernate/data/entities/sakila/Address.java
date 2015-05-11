package com.hibernate.data.entities.sakila;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 5/7/2015.
 */
@Entity
@Access(AccessType.FIELD)
@Table(name="ADDRESS")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ADDRESS_ID")
    private int addressId;

    //Many addresses to one city
    @ManyToOne
    @JoinColumn(name="CITY_ID", updatable = false, nullable = false)
    private City city;

    @Column(name="ADDRESS")
    private String address;

    @Column(name="ADDRESS2")
    private String address2;

    @Column(name="DISTRICT")
    private String district;

    @Column(name="POSTAL_CODE")
    private String postalCode;

    @Column(name="PHONE")
    private String phone;

    @Column(name="LAST_UPDATE")
    private Timestamp lastUpdatedTimestamp;



    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Timestamp getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }

    public void setLastUpdatedTimestamp(Timestamp lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
