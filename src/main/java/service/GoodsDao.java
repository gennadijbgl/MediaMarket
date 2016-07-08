package service;

import entities.Category;
import entities.Goods;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.sql.SQLException;
import java.util.ArrayList;

@Stateless
public class GoodsDao
{
    @PersistenceContext(unitName = "Store")
    private EntityManager em;

    public void save(Goods item)throws SQLException {
        em.persist(item);
    }

    public void update(Goods item)throws SQLException {
        em.merge(item);
    }

    public void delete(int id)throws SQLException {
        em.remove(findById(id));
    }

    public Goods findById(int id) {
        return (Goods) em.createQuery(
                "SELECT c FROM goods c WHERE c.id = :id")
                .setParameter("id", id).getSingleResult();
    }


    public ArrayList<Goods> findAll() {
        Query query = em.createQuery("select y from goods y");
        return new ArrayList<Goods>(query.getResultList());
    }

}
