package com.hibernate.data.entities.sakila;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Alex on 5/10/2015.
 */
@Entity
@Access(AccessType.FIELD)
@Table(name="PAYMENT")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="PAYMENT_ID")
    private int paymentId;

    @ManyToOne
    @JoinColumn(name="CUSTOMER_ID", updatable = false)
    private Customer customer;

    @OneToOne
    @JoinColumn(name="STAFF_ID")
    private Staff staff;

    @OneToMany
    @JoinColumn(name="RENTAL_ID")
    private List<Rental> rentalList;

    @Column(name="AMOUNT")
    private float amount;

    @Column(name="PAYMENT_DATE")
    private Timestamp paymentDate;

    @Column(name="LAST_UPDATE")
    private Timestamp lastUpdate;

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
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

    public List<Rental> getRentalList() {
        return rentalList;
    }

    public void setRentalList(List<Rental> rentalList) {
        this.rentalList = rentalList;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Timestamp getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Timestamp paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
