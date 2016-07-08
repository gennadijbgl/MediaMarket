package service;


import entities.Category;
import entities.Role;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.SQLException;
import java.util.List;

@Stateless
public class RoleDao
{
    @PersistenceContext(unitName = "Store")
    private EntityManager em;

    public void save(Role item)
    {
        em.persist(item);
    }

    public void delete(int id)throws SQLException {
        em.remove(findById(id));
    }
    public void update(Role item)throws SQLException {
        em.merge(item);
    }
    public List findById(int id) {
        return em.createQuery(
                "SELECT c FROM roles c WHERE c.id = :id")
                .setParameter("id", id)
                .getResultList();
    }
    public List findAll() {
        return em.createQuery(
                "SELECT c FROM roles c")
                .getResultList();
    }
}
