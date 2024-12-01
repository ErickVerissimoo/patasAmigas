/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.patasamigas.model.DAOs;

import com.corespring.patasamigas.model.SerVivo;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Query;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Erick
 * @param <T> tipo da classe a ser trabalhada
 * @param <ID> tipo do id
 */
@Dependent
public abstract class GenericAbstractDAO<T extends SerVivo, ID> implements GenericDAO<T, ID> {
    @Inject
    private Session sessao;
    private final Class<T> entityclass = getEntityClass();
    public GenericAbstractDAO(){}    
    @Override
    public void add(T entity){
        sessao.beginTransaction();
        sessao.persist(entity);
        sessao.getTransaction().commit();
    }

    
    @Override
    public void delete(ID id) {
        
        sessao.beginTransaction();
        if(sessao.get(entityclass, id) !=null){
                    sessao.remove(sessao.get(entityclass, id));

        }else{
            throw new EntityNotFoundException("Entidade não existe");
        }
                sessao.getTransaction().commit();

    }

    @Override
    public T get(ID id) {
        if(sessao.get(entityclass, id) ==null){
            throw new EntityNotFoundException("Entidade não existe");
        }
        return sessao.get(entityclass, id);
    }

    @Override
    public List<T> getAll() {
        return sessao.createNativeQuery("select * from " + entityclass.getSimpleName(), entityclass).list();
    }

    @Override
    public void update( T entity) throws EntityNotFoundException {
        sessao.beginTransaction();

        sessao.merge(entity);
                
        sessao.getTransaction().commit();
    }

    @Override
    public boolean exists(ID id) {
        Query consulta = sessao.createQuery("Select p from " + entityclass.getSimpleName() + " p where p.id=:id ", entityclass);
        consulta.setParameter("id", id);
        return consulta.getSingleResult() ==null;
    }
   public abstract Class<T> getEntityClass();
}