package pl.coderslab.dao;


import org.springframework.stereotype.Repository;
import pl.coderslab.model.Contact;
import pl.coderslab.model.Registration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class ContactDao {

    @PersistenceContext
    EntityManager entityManager;

    public void save(Contact entity) {
        entityManager.persist(entity);
    }

    public void update(Contact entity) {
        entityManager.merge(entity);
    }

    public Contact getById(long id) {
        return entityManager.find(Contact.class, id);
    }

    public void delete(Contact contact) {
        entityManager.remove(entityManager.contains(contact) ? contact : entityManager.merge(contact));
    }

    public void deleteById(long id) {
        Contact entity = getById(id);
        if (entity != null) {
            entityManager.remove(entity);
        }
    }
}

