package com.hibernate.data.entities.tutorial;

import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @ElementCollection
    @CollectionTable(name="USER_ADDRESS", joinColumns=@JoinColumn(name="USER_ID"))
    @AttributeOverrides({@AttributeOverride(name="addressLine1", column=@Column(name="USER_ADDRESS_LINE_1")),
            @AttributeOverride(name="addressLine2", column =@Column(name="USER_ADDRESS_LINE_2"))})

    private List<Address> addresses = new ArrayList<Address>(); //composite value type

    @Transient
    private List<String> aliases; // collection value type

    @Transient
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

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
