/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.patasamigas.service;

import com.corespring.patasamigas.model.DAOs.funcionarioDAO;
import com.corespring.patasamigas.model.Funcionario;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Erick
 */
@ApplicationScoped
public class FuncionarioService implements GenericService<Funcionario, Integer>{
    @Inject
    private funcionarioDAO func;

    @Override
    public void add(Funcionario entity) {
        func.add(entity);
    }

    @Override
    public void update(Funcionario entity) {
        func.update(entity);
    }

    @Override
    public Funcionario get(Integer id) {
        return func.get(id);
    }

    @Override
    public List<Funcionario> getAll() {
        return func.getAll();
    }

    @Override
    public void delete(Integer id) {
        func.delete(id);
    }
    
   }
