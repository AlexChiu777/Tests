package com.hibernate.data.entities.sakila;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Alex on 5/10/2015.
 */
@Entity
@Access(AccessType.FIELD)
@Table(name="STORE")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="STORE_ID")
    private int storeId;

    @OneToOne
    @JoinColumn(name="MANAGER_STAFF_ID", referencedColumnName = "STAFF_ID")
    private Staff staff;

    @OneToOne
    @JoinColumn(name="ADDRESS_ID")
    private Address address;

    @Column(name="LAST_UPDATE")
    private Timestamp lastUpdate;

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
