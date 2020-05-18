package bean;

import javax.ejb.*;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Stateless
public class EntityIO<T> {
    private Class<T> c1;
    @PersistenceContext(unitName="JPAExample")
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAExample");
    private EntityManager em = emf.createEntityManager();

    public EntityIO(Class<T> c1){
        this.c1 = c1;
    }

    public void create(T obj){
        em.persist(obj);
    }
    public T find(Object id){
         return em.find(c1,id);
    }

    public Class<T> getValue(){
        return this.c1;
    }
}