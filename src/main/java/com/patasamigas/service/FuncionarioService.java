/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patasamigas.service;

import com.patasamigas.model.DAOs.funcionarioDAO;
import com.patasamigas.model.Funcionario;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

/**
 *
 * @author Erick
 */
@ApplicationScoped
public class FuncionarioService extends GenericAbstractService<Funcionario, Integer, funcionarioDAO>{
    @Inject
    public FuncionarioService(funcionarioDAO dao) {
        super(dao);
    }
    
    public FuncionarioService(){
        super();
    }
   }
