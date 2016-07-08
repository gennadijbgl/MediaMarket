package service;

import entities.Category;
import entities.Goods;
import entities.Order;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class OrderDao
{
    @PersistenceContext(unitName = "Store")
    private EntityManager em;

    public void save(Order item)throws SQLException {
        em.persist(item);

    }

    public void delete(int id)throws SQLException {
       throw new NotImplementedException();
       // em.remove(findById(id));
    }

    public List<Order> findById(int id) {
        return  em.createQuery(
                "SELECT c FROM orders c WHERE c.userId = :id")
                .setParameter("id", id).getResultList();
    }


}
