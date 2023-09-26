package pl.coderslab.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pl.coderslab.model.Hoodie;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Repository
@Transactional
public class HoodieDao {
    public List<Hoodie>getList(){
        String query = "SELECT h FROM Hoodie h";
        TypedQuery<Hoodie> hoodieQuery = entityManager.createQuery(query, Hoodie.class);
        return hoodieQuery.getResultList();
    }
    @PersistenceContext
    EntityManager entityManager;

    public void save(Hoodie entity) {
        entityManager.persist(entity);
    }

    public void update(Hoodie entity) {
        entityManager.merge(entity);
    }

    public Hoodie getById(long id) {
        return entityManager.find(Hoodie.class, id);
    }

    public void delete(Hoodie hoodie) {
        entityManager.remove(entityManager.contains(hoodie) ? hoodie : entityManager.merge(hoodie));
    }

    public void deleteById(long id) {
        Hoodie entity = getById(id);
        if (entity != null) {
            entityManager.remove(entity);
        }
    }
}