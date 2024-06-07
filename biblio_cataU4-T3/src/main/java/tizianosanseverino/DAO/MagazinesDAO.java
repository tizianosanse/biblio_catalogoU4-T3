package tizianosanseverino.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import tizianosanseverino.entities.Magazine;

public class MagazinesDAO {

        private final EntityManager em;


        public MagazinesDAO(EntityManager em) {
            this.em = em;}

       public void save(Magazine magazine) {
           EntityTransaction transaction = em.getTransaction();
           transaction.begin();
           em.persist(magazine);
           transaction.commit();
           System.out.println("salvato");
       }
}
