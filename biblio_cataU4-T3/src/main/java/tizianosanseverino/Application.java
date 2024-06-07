package tizianosanseverino;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import tizianosanseverino.DAO.BooksDAO;
import tizianosanseverino.DAO.LecteraryElementDAO;
import tizianosanseverino.DAO.MagazinesDAO;
import tizianosanseverino.entities.Book;
import tizianosanseverino.entities.Magazine;
import tizianosanseverino.enums.Periodicity;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioCata");

    public static void main(String[] args) {
        System.out.println("Hello World!");
        EntityManager em = emf.createEntityManager();
        LecteraryElementDAO lmd = new LecteraryElementDAO(em);
        Magazine rivista1= new Magazine("la gazzetta dello sport",2024,40, Periodicity.WEEKLY);
        lmd.save(rivista1);
    }
}
