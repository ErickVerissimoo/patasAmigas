/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.patasamigas.service;

import com.corespring.patasamigas.model.DAOs.GenericAbstractDAO;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.List;
import lombok.NoArgsConstructor;

/**
 *
 * @author Erick
 * @param <T>
 * @param <DAO>
 * @param <ID>
 */
@Dependent
public abstract class GenericAbstractService<T, ID, DAO extends GenericAbstractDAO<T, ID>> implements GenericService<ID, T>{
   
    private DAO dao;
      @Inject
    public GenericAbstractService(DAO dao) {
        this.dao = dao;
    }
    public GenericAbstractService(){
        
    }
    @Override
    public void add(T entity) {
    dao.add(entity);
    }

    @Override
    public void delete(ID id) {
        dao.delete(id);
        
    }

    @Override
    public void update(T entity) {
        dao.update(entity);
    }

    @Override
    public List<T> getAll() {
        return dao.getAll();
    }

    @Override
    public T get(ID id) {
        
        return dao.get(id);
    }
    
}
