package com.hibernate.data;

import com.hibernate.data.entities.User;
import com.hibernate.data.utils.HibernateUtil;
import com.hibernate.data.utils.HibernateUtilPropertiesFileConfig;
import org.hibernate.Session;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Alex on 5/5/2015.
 */
public class Application {
    public static void main(String[] args) {
        Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession();
        session.getTransaction().begin();

        User user = new User();
        user.setBirthDate(new Date());
        user.setEmailAddress("test@email.com");
        user.setFirstName("FirstName");
        user.setLastName("LastName");
        user.setLastUpdatedBy("Alex");
        user.setCreatedBy("Alex");
        user.setCreatedDate(new Date());
        user.setLastUpdatedDate(new Date());

        session.save(user);

        session.getTransaction().commit();


        session.close();
    }
}
