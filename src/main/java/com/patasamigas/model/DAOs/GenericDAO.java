/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.patasamigas.model.DAOs;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
/**
 *
 * @author Erick
 * @param <T>
 * @param <ID>
 */
public interface GenericDAO<T, ID> {
    
    boolean exists(ID entity);
    
    void add(T entity);
    /*
    Atualiza uma entidade com base nos seus dados,
    caso contrário lança uma EntityNotFoundException
    
    */
    void update(T entity) throws EntityNotFoundException;

    /**
     *
     * @return 
     * retorna todos os elementos
     */
    List<T> getAll();
    /**
     * @param id
     * @return 
     * @throws EntityNotFoundException
   caso contrário lança uma EntityNotFoundException
    */


    T get(ID id) throws EntityNotFoundException;
    /*
    Deleta uma entidade com base no id, caso
    contrário lança uma EntityNotFoundException
    */
    void delete(ID id) throws EntityNotFoundException;
} 
