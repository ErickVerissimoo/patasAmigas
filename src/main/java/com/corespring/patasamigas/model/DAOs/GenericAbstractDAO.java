/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.patasamigas.model.DAOs;

import jakarta.inject.Inject;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Erick
 * @param <T>
 * @param <ID>
 */
public abstract class GenericAbstractDAO<T, ID> implements GenericDAO<T, ID> {
    @Inject
    private Session sessao;
    @Override
    public void add(T entity){
        sessao.beginTransaction();
        sessao.persist(entity);
        sessao.getTransaction().commit();
    }

    
    @Override
    public void delete(ID id) {
        
        sessao.beginTransaction();
        if(sessao.get(this.getEntityClass(), id) !=null){
                    sessao.remove(this.getEntityClass());

        }else{
            throw new EntityNotFoundException("Entidade não existe");
        }
                sessao.getTransaction().commit();

    }

    @Override
    public T get(ID id) {
        if(sessao.get(this.getEntityClass(), id) ==null){
            throw new EntityNotFoundException("Entidade não existe");
        }
        return sessao.get(this.getEntityClass(), id);
    }

    @Override
    public List<T> getAll() {
        return sessao.createNativeQuery("select * from " + this.getEntityClass().getSimpleName(), this.getEntityClass()).list();
    }

    @Override
    public void update(T entity) throws EntityNotFoundException {
        sessao.beginTransaction();

        sessao.merge(entity);
                
        sessao.getTransaction().commit();
    }
    
   public abstract Class<T> getEntityClass();
}
