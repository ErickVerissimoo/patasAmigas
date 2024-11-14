/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.corespring.patasamigas.service;

import java.util.List;

/**
 *
 * @author Erick
 * @param <ID>
 * @param <T>
 */
public interface GenericService<ID, T> {
    void add(T entity);
    void update(T entity);
    T get(ID id);
    List<T> getAll();
    void delete(ID id);
}
