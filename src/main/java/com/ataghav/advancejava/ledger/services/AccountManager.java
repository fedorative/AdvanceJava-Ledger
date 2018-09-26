package com.ataghav.advancejava.ledger.services;

import com.ataghav.advancejava.ledger.entities.Account;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AccountManager {
    private static final String PERSISTENCE_UNIT_NAME = "h2-jpa";
    private static EntityManagerFactory factory;

    public static void create(String number, String owner, double balance) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        try {
            em.persist(new Account(number,owner,balance));
//            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            System.out.println("ERROR!!! " + e.getMessage());
        }
    }

    public static void read(String number) {
    }

    public static void update(String number, String owner, double balance) {
    }

    public static void delete(String number) {
    }
}
