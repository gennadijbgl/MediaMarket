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
public class CategoryDao
{
    @PersistenceContext(unitName = "Store")
    private EntityManager em;

    public int saveCategory(Category category) {
        try {


            em.persist(category);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return 1;
    }

    public void delete(int id)throws SQLException {
      em.remove(findById(id));
    }

    public Category findById(int id) {
        return (Category) em.createQuery(
                "SELECT c FROM category c WHERE c.id = :id")
                .setParameter("id", id).getSingleResult();
    }


    public void update(Category item)throws SQLException {
        em.merge(item);
    }


    public ArrayList<Category> findAll() {
        Query query = em.createQuery("select u from category u");
        return new ArrayList<Category>(query.getResultList());
    }

}
