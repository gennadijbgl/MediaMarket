package service;


import entities.Role;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class RoleDao
{
    @PersistenceContext(unitName = "Store")
    private EntityManager em;

    public void save(Role role)
    {
        em.persist(role);
    }

    public List find(int id) {
        return em.createQuery(
                "SELECT c FROM roles c WHERE c.userId = :id")
                .setParameter("id", id)
                .getResultList();
    }
    public List findAll() {
        return em.createQuery(
                "SELECT c FROM roles c")

                .getResultList();
    }
}
