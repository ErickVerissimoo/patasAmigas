/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.corespring.patasamigas.model.DAOs;
import java.util.List;
/**
 *
 * @author Erick
 * @param <T>
 * @param <ID>
 */
public interface GenericDAO<T, ID> {
    void add(T entity);
    void update(T entity);
    List<T> getAll();
    T get(ID id);
    void delete(ID id);
}
