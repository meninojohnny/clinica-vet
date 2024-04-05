package com.johnny.generic;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class GenericService<T> {
    
    @PersistenceContext
    EntityManager entityManager;
    
    private Class<T> entity;
    
    public GenericService(Class<T> entity) {
        this.entity = entity;
    }
    
    public T find(Long id) {
        return entityManager.find(entity, id);
    }
    
    public List<T> findAll() {
        String sql = "SELECT e FROM " + entity.getName() + " e WHERE e.active = true";
        return entityManager.createQuery(sql).getResultList();
    }
    
    public void save(T entity) {
        entityManager.persist(entity);
    }
    
    public void update(T entity) {
        this.entityManager.merge(entity);
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Class<T> getEntity() {
        return entity;
    }

    public void setEntity(Class<T> entity) {
        this.entity = entity;
    }
    
    
    
}
