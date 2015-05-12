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
        Session session = null;
        try {
             session = HibernateUtil.INSTANCE.getSessionFactory().openSession();
            session.getTransaction().begin();

        /*Address address = (Address) session.get(Address.class, 6);

        System.out.println(address.getCity().getCity());*/

            //Country country = (Country) session.get(Country.class, 10);
            //Customer customer = (Customer) session.get(Customer.class, 1);

            Film film = (Film) session.get(Film.class, 2);
            Actor actor = (Actor) session.get(Actor.class, 2);
            Inventory inventory = (Inventory) session.get(Inventory.class, 2);

            Store store = (Store) session.get(Store.class, 2);

            Rental rental = (Rental) session.get(Rental.class, 2);

            Payment payment = (Payment) session.get(Payment.class, 2);


            session.close();
        } finally {
            if (session != null) {
                session.close();
            }

            HibernateUtil.INSTANCE.getSessionFactory().close();
        }

    }


}

