package com.hibernate.utils;


import com.hibernate.data.entities.tutorial.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


/**
 * Created by Alex on 5/5/2015.
 */
public enum HibernateUtilPropertiesFileConfig {
    INSTANCE;

    //instance var, constructor
    private final SessionFactory sessionFactory;

    HibernateUtilPropertiesFileConfig() {
        sessionFactory = buildSessionFactory();
    }

    private static SessionFactory buildSessionFactory() {
        SessionFactory sessionFactory;
        try {
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(User.class);
            sessionFactory = configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("There was an error building the factory");
        }
        return sessionFactory;
    }

    public static HibernateUtilPropertiesFileConfig getInstance() {
        return INSTANCE;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
