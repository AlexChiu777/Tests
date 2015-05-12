package com.hibernate.data.entities.sakila;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Alex on 5/10/2015.
 */
@Entity
@Access(AccessType.FIELD)
@Table(name="RENTAL")
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="RENTAL_ID")
    private int rentalId;

    @Column(name="RENTAL_DATE")
    private Timestamp rentalDate;

    @ManyToOne
    @JoinColumn(name="INVENTORY_ID")
    private Inventory inventory;

    @ManyToOne
    @JoinColumn(name="CUSTOMER_ID")
    private Customer customer;

    @Column(name="RETURN_DATE")
    private Timestamp returnDate;

    @ManyToOne
    @JoinColumn(name="STAFF_ID")
    private Staff staff;

    @Column(name="LAST_UPDATE")
    private Timestamp lastUpdate;

    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }

    public Timestamp getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Timestamp rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Timestamp getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Timestamp returnDate) {
        this.returnDate = returnDate;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
}

