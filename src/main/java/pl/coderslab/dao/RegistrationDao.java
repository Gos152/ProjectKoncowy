package pl.coderslab.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.model.Registration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class RegistrationDao {
    @PersistenceContext
    EntityManager entityManager;
    public void save(Registration entity) {
        entityManager.persist(entity);
    }

    public void update(Registration entity) {
        entityManager.merge(entity);
    }

    public Registration getById(long id) {
        return entityManager.find(Registration.class, id);
    }

    public void delete(Registration registration) {
        entityManager.remove(entityManager.contains(registration) ? registration : entityManager.merge(registration));
    }

    public void deleteById(long id) {
        Registration entity = getById(id);
        if (entity != null) {
            entityManager.remove(entity);
        }
    }
}

