package pl.coderslab.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.model.Login;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class LoginDao {
    @PersistenceContext
    EntityManager entityManager;
    public void save(Login entity) {
        entityManager.persist(entity);
    }

    public void update(Login entity) {
        entityManager.merge(entity);
    }

    public Login getById(long id) {
        return entityManager.find(Login.class, id);
    }

    public void delete(Login login) {
        entityManager.remove(entityManager.contains(login) ? login : entityManager.merge(login));
    }

    public void deleteById(long id) {
        Login entity = getById(id);
        if (entity != null) {
            entityManager.remove(entity);
        }
    }

}
