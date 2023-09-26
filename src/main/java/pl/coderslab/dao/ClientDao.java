package pl.coderslab.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.model.Client;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class ClientDao {
    @PersistenceContext
    EntityManager entityManager;

    public void save(Client entity) {
        entityManager.persist(entity);
    }

    public void update(Client entity) {
        entityManager.merge(entity);
    }

    public Client getById(long id) {
        return entityManager.find(Client.class, id);
    }

    public void delete(Client client) {
        entityManager.remove(entityManager.contains(client) ? client : entityManager.merge(client));
    }

    public void deleteById(long id) {
        Client entity = getById(id);
        if (entity != null) {
            entityManager.remove(entity);
        }
    }
}
