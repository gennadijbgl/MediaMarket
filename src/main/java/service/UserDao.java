package service;

import entities.Role;
import entities.User;
import org.hibernate.Hibernate;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Stateless
public class UserDao
{
    @PersistenceContext(unitName = "Store")
    private EntityManager em;

    public void  save(User user)
    {
        em.persist(user);
    }

    public ArrayList<User> findByUsername(String username)
    {
        return new ArrayList<User>(em.createQuery(
                "SELECT c FROM users c WHERE c.username = :username")
                .setParameter("username", username)
                .getResultList());
    }

    public User findById(int id)
    {
        return (User) em.createQuery(
                "SELECT c FROM users c WHERE c.id = :id")
                .setParameter("id", id).getSingleResult();

    }


    public List findByIdT(int id)
    {
        return em.createQuery(
                "SELECT c FROM users c WHERE c.id = :id")
                .setParameter("id", id)
                .getResultList();
    }


    public User findByIdTT(int id)
    {
        List t = em.createQuery(
                "SELECT c FROM users c WHERE c.id = :id")
                .setParameter("id", id)
                .getResultList();
        User r = (User) t.get(0);
        return r;
    }


    public List findAll() {
        return em.createQuery("select u from users u").getResultList();
    }

    public void delete(int id)throws SQLException {
        em.remove(findById(id));
    }
    public void update(User item)throws SQLException {
        em.merge(item);
    }
}
