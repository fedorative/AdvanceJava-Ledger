package com.ataghav.advancejava.ledger.servlets;

import com.ataghav.advancejava.ledger.entities.Account;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/test")
public class FirstServlet extends HttpServlet {
    private static final String PERSISTENCE_UNIT_NAME = "h2-jpa";
    private static EntityManagerFactory factory;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter printWriter = res.getWriter();
        printWriter.print("This is me, I'm OK!2");

        Account account01 = new Account("010001", "Ahmad Ali", 120.00);

        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        try {
            em.persist(account01);
//            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            System.out.println("ERROR!!! " + e.getMessage());
        }


//        Account acc = em.find()

    }
}
