/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.corespring.patasamigas.model.DAOs;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
/**
 *
 * @author Erick
 * @param <T>
 * @param <ID>
 */
public interface GenericDAO<T, ID> {
    void add(T entity);
    void update(T entity) throws EntityNotFoundException;
    List<T> getAll();
    T get(ID id) throws EntityNotFoundException;
    void delete(ID id) throws EntityNotFoundException;
} 
