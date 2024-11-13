/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.corespring.patasamigas.service;

import java.util.Collection;

/**
 *
 * @author Erick
 */
public interface GenericService<T, ID> {
    void add(T entity);
    void update(T entity);
    T get(ID id);
    Collection<T> getAll();
    void delete(ID id);
}
