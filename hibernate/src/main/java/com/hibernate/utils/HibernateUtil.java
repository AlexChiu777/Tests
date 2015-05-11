package com.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Created by Alex on 5/5/2015.
 */
public enum HibernateUtil {
    INSTANCE;

    //instance var, constructor
    private final SessionFactory sessionFactory;

    HibernateUtil() {
        sessionFactory = buildSessionFactory();
    }

    private static SessionFactory buildSessionFactory() {
        SessionFactory sessionFactory;
        try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            sessionFactory = configuration.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("There was an error building the factory");
        }
        return sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}