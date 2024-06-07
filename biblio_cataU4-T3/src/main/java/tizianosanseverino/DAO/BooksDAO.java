package tizianosanseverino.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import tizianosanseverino.entities.Book;
import tizianosanseverino.entities.LecteraryElement;

public class BooksDAO {
    private final EntityManager em;
    public BooksDAO(EntityManager em) {
        this.em = em;
    }
    public void save(Book book) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(book);
        transaction.commit();
        System.out.println("il libro con titolo:"+ book.getTitle()+"e stato salvato" );
    }
    public Book findByAuthor(String author) {
         Book b = em.find(Book.class, author);
        return b;
    }
}
