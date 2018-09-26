package com.ataghav.advancejava.ledger.servlets;

import com.ataghav.advancejava.ledger.entities.Account;
import com.ataghav.advancejava.ledger.services.AccountManager;

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

@WebServlet(urlPatterns = "/first")
public class FirstServlet extends HttpServlet {
    private static final String PERSISTENCE_UNIT_NAME = "h2-jpa";
    private static EntityManagerFactory factory;
    private static AccountManager am;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter printWriter = res.getWriter();
        String formNumber = req.getParameter("number");
        String formOwner = req.getParameter("owner");
        String formBalance = req.getParameter("balance");

        if (req.getParameter("create") != null) {
            printWriter.print("Create");
            if (formNumber != null && formOwner != null && formBalance != null) {
                am.create(formNumber, formOwner, Double.parseDouble(formBalance));
            }
        } else if (req.getParameter("read") != null) {
            printWriter.print("Read");
            if (formNumber != null) {
                am.read(formNumber);
            }
        } else if (req.getParameter("update") != null) {
            printWriter.print("Update");
            if (formNumber != null && formOwner != null && formBalance != null) {
                am.update(formNumber, formOwner, Double.parseDouble(formBalance));
            }
        } else if (req.getParameter("delete") != null) {
            printWriter.print("Delete");
            if (formNumber != null) {
                am.delete(formNumber);
            }
        }

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
    }
}
