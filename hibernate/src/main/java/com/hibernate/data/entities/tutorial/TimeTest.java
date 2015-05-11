package com.hibernate.data.entities.tutorial;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Alex on 5/5/2015.
 */
@Entity
@Table(name="")
public class TimeTest {

    @Id
    @GeneratedValue
    private long timeTestId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTimeColumn;

    @Temporal(TemporalType.TIMESTAMP)
    private Date timestampColumn;

    @Temporal(TemporalType.DATE)
    private Date dateColumn;

    @Temporal(TemporalType.TIME)
    private Date timeColumn;


    private java.sql.Date sqlDateTimeColumn;
    private java.sql.Date sqlTimestampColumn;
    private java.sql.Date sqlDateColumn;
    private java.sql.Date sqlTimeColumn;
}
