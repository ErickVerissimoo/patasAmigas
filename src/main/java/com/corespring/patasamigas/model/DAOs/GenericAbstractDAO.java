/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.patasamigas.model.DAOs;

import com.corespring.patasamigas.model.Funcionario;
import jakarta.inject.Inject;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Erick
 */
public abstract class GenericAbstractDAO<T extends Object, ID> implements GenericDAO<T, ID> {
    @Inject
    private Session sessao;
    @Override
    public void add(T entity){
        sessao.beginTransaction();
        sessao.persist(entity);
        sessao.getTransaction();
    }

    
    public void delete(ID id) {
        
        sessao.beginTransaction();
        
        sessao.remove(this.getEntityClass());
    }
    
   public abstract Class<T> getEntityClass();
}
