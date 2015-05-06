package com.hibernate.data.entities;

import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Alex on 5/4/2015.
 */
@Entity
@Table(name="USER")
@Access(value = AccessType.FIELD)
public class User {
    @Id
    //identity column
    /*@GeneratedValue(strategy = GenerationType.IDENTITY)*/

    //table primary key
    /*@GeneratedValue(strategy = GenerationType.TABLE, generator = "user_table_generator")
    @TableGenerator(name="user_table_generator",
            table="USER_KEYS", pkColumnName = "PK_NAME", valueColumnName = "PK_VALUE")
    */

    //auto generator - default (pick default from db)
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue

    //oracle user id sequence
    /*@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="user_seq")
    @SequenceGenerator(name = "user_seq", sequenceName = "USER_ID_SEQ")*/
    @Column(name="USER_ID")
    private long userID;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="DOB", nullable = false)
    private Date BirthDate;

    @Column(name="EMAIL")
    private String emailAddress;

    @Column(name="LAST_UPDATED_DATE")
    private Date lastUpdatedDate;

    @Column(name="LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @Column(name="CREATED_DATE", updatable = false)
    private Date createdDate;

    @Column(name="CREATED_BY", updatable = false)
    private String createdBy;

    private Address address; //composite value type

    private User user;  //entity type

    //transient is used to tell hibernate to ignore the field
    @Transient
    private boolean valid;

    //using formula annotation to calculate - only calculated upon a select
    //formula ties to underlying db, so careful
    @Formula("lower(datediff(curdate(), dob)/365)")
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
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

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", BirthDate=" + BirthDate +
                ", emailAddress='" + emailAddress + '\'' +
                ", lastUpdatedDate=" + lastUpdatedDate +
                ", lastUpdatedBy='" + lastUpdatedBy + '\'' +
                ", createdDate=" + createdDate +
                ", createdBy='" + createdBy + '\'' +
                ", valid=" + valid +
                ", age=" + age +
                '}';
    }
}
