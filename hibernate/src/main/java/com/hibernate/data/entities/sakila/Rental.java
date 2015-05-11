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

    @Column(name="INVENTORY_ID")
    private int inventoryId;

    @Column(name="CUSTOMER_ID")
    private int customerId;

    @Column(name="RETURN_DATE")
    private Timestamp returnDate;

    @Column(name="STAFF_ID")
    private int staffId;

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

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Timestamp getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Timestamp returnDate) {
        this.returnDate = returnDate;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
