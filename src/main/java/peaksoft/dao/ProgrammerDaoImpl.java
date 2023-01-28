package peaksoft.dao;

import peaksoft.config.DatabaseConnection;
import peaksoft.model.Programmer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.io.IOException;
import java.util.Optional;

public class ProgrammerDaoImpl implements AutoCloseable{
    private EntityManagerFactory entityManagerFactory = DatabaseConnection.createEntityManagerFactory();

    // save
    public void save(Programmer newProgrammer){
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(newProgrammer);
            entityManager.getTransaction().commit();
            entityManager.close();
        }

    // findById
    public Optional <Programmer> findById(Long id){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Programmer resProg = entityManager.createQuery("select p from Programmer p where p.id = :id ", Programmer.class)
                .setParameter("id", id).getSingleResult();
        entityManager.getTransaction().commit();
        entityManager.close();
        return Optional.ofNullable(resProg);
    }


    //excistByEmail


    // update
    @Override
    public void close() throws Exception {
        entityManagerFactory.close();
    }
}
