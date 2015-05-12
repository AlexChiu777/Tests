package com.hibernate.data.entities.sakila;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Alex on 5/7/2015.
 */
@Entity
@Access(AccessType.FIELD)
@Table(name="ACTOR")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ACTOR_ID")
    private int actorID;
    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="LAST_NAME")
    private String lastName;
    @Column(name="LAST_UPDATE")
    private Date lastUpdate;

    @OneToMany
    @JoinTable(name="FILM_ACTOR", joinColumns = @JoinColumn(name="ACTOR_ID"),
            inverseJoinColumns = @JoinColumn(name="FILM_ID"))
    private List<Film> filmList;

    public int getActorID() {
        return actorID;
    }

    public void setActorID(int actorID) {
        this.actorID = actorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
