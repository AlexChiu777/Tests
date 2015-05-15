package com.hibernate;

import com.hibernate.data.entities.sakila.Film;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Alex on 5/12/2015.
 */
public class JpaTest {


    public static void main(String[] args) {
        EntityManagerFactory emf = null;

        EntityManager em = null;

        EntityTransaction tx = null;
        try {
            emf = Persistence.createEntityManagerFactory("unit");
            em = emf.createEntityManager();
            tx = em.getTransaction();
            tx.begin();

            //em.find(); similar to get
            //em.getReference(); similar to load
            //em.persist(); similar to save
            //em.remove(); similar to delete
            //em.merge(); merge entity back to persistence context
            //em.clear(); all entity in persistence context will be detached
            //em.detach(); detach a single entity

            //JPQL
            TypedQuery<Film> query = em.createQuery("from Film t" +
                    " where (t.length between 50 and 500) and t.title like '%T' order by t.title", Film.class);
            List<Film> filmList = query.getResultList();

            for (Film f: filmList) {
                System.out.println(f.getTitle());
            }

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
            emf.close();
        }
    }
}
