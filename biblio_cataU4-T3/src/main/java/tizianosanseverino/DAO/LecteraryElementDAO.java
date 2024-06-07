package tizianosanseverino.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import tizianosanseverino.entities.Book;
import tizianosanseverino.entities.LecteraryElement;
import tizianosanseverino.entities.Magazine;

import java.util.UUID;

public class LecteraryElementDAO {
    private  EntityManager em;

    public LecteraryElementDAO(EntityManager em) {
        this.em = em;
    }

    public void save(LecteraryElement magazine) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(magazine);
        transaction.commit();
        System.out.println("salvato");

    } public LecteraryElement findByIsbn(UUID isbn) {
        LecteraryElement le = em.find(LecteraryElement.class, isbn);
        return le;
    }
    public LecteraryElement findByYearOfPublication(int yearOfPublication) {
        LecteraryElement le = em.find(LecteraryElement.class, yearOfPublication);
        return le;
    }
    public LecteraryElement findBy(int yearOfPublication) {
        LecteraryElement le = em.find(LecteraryElement.class, yearOfPublication);
        return le;
    }
    public LecteraryElement findByTitle(String title) {
        LecteraryElement le = em.find(LecteraryElement.class, title);
        return le;
    }
}
