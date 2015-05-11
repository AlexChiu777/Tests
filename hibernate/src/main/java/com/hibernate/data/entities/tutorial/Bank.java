package com.hibernate.data.entities.tutorial;

import javax.persistence.*;
import java.sql.Date;
import java.util.*;

/**
 * Created by Alex on 5/7/2015.
 */
@Entity
@Table(name="BANK")
@Access(value = AccessType.FIELD)
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BANK_ID")
    private int bankID;

    @Column(name = "BANK_NAME")
    private String bankName;

    @Column(name = "IS_INTERNATIONAL")
    private String isInternational;

    @Column(name = "LAST_UPDATED_DATE")
    private Date lastUpdatedDate;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @ElementCollection
    @CollectionTable(name = "BANK_CONTACT", joinColumns = @JoinColumn(name="BANK_ID"))
    @MapKeyColumn(name="POSITION_TYPE")
    @Column(name="NAME")
    private Map<String,String> contacts = new HashMap<String,String>();

    //private List<String> contacts = new ArrayList<String>();






    @Embedded
    private Address address = new Address();

    public int getBankID() {
        return bankID;
    }

    public void setBankID(int bankID) {
        this.bankID = bankID;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIsInternational() {
        return isInternational;
    }

    public void setIsInternational(String isInternational) {
        this.isInternational = isInternational;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Map<String, String> getContacts() {
        return contacts;
    }

    public void setContacts(Map<String, String> contacts) {
        this.contacts = contacts;
    }
}
