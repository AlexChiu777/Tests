package com.hibernate;

import com.hibernate.data.entities.sakila.*;
import com.hibernate.data.entities.tutorial.Address;
import com.hibernate.data.entities.tutorial.User;
import com.hibernate.utils.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Alex on 5/5/2015.
 */
public class Application {
    public static void main(String[] args) {
        Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession();
        session.getTransaction().begin();

        // new user

        /*Address address = new Address();
        address.setAddressLine1("line1");
        address.setAddressLine2("line2");
        address.setCity("city");
        address.setState("state");
        address.setZipCode("zipCode");

        Address address1 = new Address();

        address1.setAddressLine1("line12");
        address1.setAddressLine2("line23");
        address1.setCity("city2");
        address1.setState("sta2te");
        address1.setZipCode("zipC3ode");

        User user = new User();
        user.setBirthDate(getMyBirthdate());
        user.setEmailAddress("test@email.com");
        user.setFirstName("FirstName");
        user.setLastName("LastName");
        user.setLastUpdatedBy("Alex");
        user.setCreatedBy("Alex");
        user.setCreatedDate(new Date());
        user.setLastUpdatedDate(new Date());
        user.getAddresses().add(address);
        user.getAddresses().add(address1);
        session.save(user);*/

        /*Currency currency = new Currency();
        currency.setName("US Dollar");
        currency.setCountryName("United States");

        Market market = new Market();
        market.setMarketName("London Stock Exhcange");
        market.setCurrency(currency);

        session.persist(market);
        session.getTransaction().commit();

        Session session2 = HibernateUtil.INSTANCE.getSessionFactory().openSession();
        session2.getTransaction().begin();

        //Currency dbCurrency = (Currency) session2.get(Currency.class, new CurrencyId("Dollar", "United States"));
        Market dbMarket = (Market) session2.get(Market.class, market.getMarketId());
        System.out.println(dbMarket.getCurrency().getName());*/



        //refreshing
        //session.refresh(user);
        //System.out.println(user);



        /*//updating user
        session.beginTransaction();
        User dbUser = (User) session.get(User.class, user.getUserID());
        dbUser.setFirstName("Alex");
        session.save(dbUser);
        session.getTransaction().commit();*/


        //address - normal composite object
        /*Bank bank = new Bank();
        bank.setBankName("alex");
        bank.setCreatedDate(new java.sql.Date(new Date().getTime()));
        bank.setLastUpdatedDate(new java.sql.Date(new Date().getTime()));
        bank.getAddress().setAddressLine1("Alex Street 1");
        bank.getAddress().setAddressLine2("Alex Street 2");
        bank.getAddress().setState("ON");
        bank.getAddress().setCity("Markham");
        bank.getAddress().setZipCode("L4A0C5");
        bank.setIsInternational("T");
        bank.getContacts().put("Manager","Steve");
        bank.getContacts().put("Teller","Leo");
        session.save(bank);*/



//        session.getTransaction().commit();

        //HQL

        /*Scanner scanner = new Scanner(System.in);
        Query query = session.createQuery("select t from Film t " +
                "where t.length < :length");
        System.out.println("Please specify length");
        query.setParameter("length", new Integer(scanner.next()));
        List<Film> filmList = query.list();

        for (Film f : filmList) {
            System.out.println(f.getTitle());
        }*/

        Query query = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
            query = session.createQuery("select distinct t.actors from Film t join t.actors where t.releaseYear > :year");
            query.setDate("year", sdf.parse("1999-01-01"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Actor> actorList = query.list();

        for (Actor f : actorList) {
            System.out.println(f.getFirstName());
        }






//        session2.close();
        session.close();




    }

    private static Date getMyBirthdate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 1988);
        calendar.set(Calendar.MONTH, 12);
        calendar.set(Calendar.DATE, 7);
        return calendar.getTime();
    }
}
