package com.hibernate;

import com.hibernate.data.entities.sakila.*;
import com.hibernate.utils.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.beans.Customizer;
import java.util.List;

/**
 * Created by Alex on 5/7/2015.
 */
public class SakilaTest {
    public static void main(String[] args) {
        Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession();
        session.getTransaction().begin();

        /*Address address = (Address) session.get(Address.class, 6);

        System.out.println(address.getCity().getCity());*/

        Country country = (Country) session.get(Country.class, 10);
        Customer customer = (Customer) session.get(Customer.class, 1);

        //Film film = (Film) session.get(Film.class, 2);
        //Actor actor = (Actor) session.get(Actor.class, 2);


        session.close();

    }


}

