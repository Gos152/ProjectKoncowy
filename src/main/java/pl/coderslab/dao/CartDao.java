package pl.coderslab.dao;


import org.springframework.stereotype.Repository;
import pl.coderslab.model.Cart;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CartDao {
    @PersistenceContext
    EntityManager entityManager;

    public void save(Cart entity) {
        entityManager.persist(entity);
    }

    public void update(Cart entity) {
        entityManager.merge(entity);
    }

    public Cart getById(long id) {
        return entityManager.find(Cart.class, id);
    }

    public void delete(Cart cart) {
        entityManager.remove(entityManager.contains(cart) ? cart : entityManager.merge(cart));
    }

    public void deleteById(long id) {
        Cart entity = getById(id);
        if (entity != null) {
            entityManager.remove(entity);
        }
    }
//    public List<Cart> getAll() {
//        return entityManager.createQuery("SELECT c FROM Cart c", Cart.class).getResultList();
//    }
}
