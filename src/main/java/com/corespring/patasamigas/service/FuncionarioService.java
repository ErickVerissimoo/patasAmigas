/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.patasamigas.service;

import com.corespring.patasamigas.model.DAOs.funcionarioDAO;
import com.corespring.patasamigas.model.Funcionario;
import jakarta.enterprise.context.ApplicationScoped;
import org.hibernate.service.spi.InjectService;

/**
 *
 * @author Erick
 */
@ApplicationScoped

public class FuncionarioService extends GenericAbstractService<Funcionario, Integer, funcionarioDAO>{
    public FuncionarioService(funcionarioDAO dao) {
        super(dao);
    }
    
    public FuncionarioService(){
        super();
    }
   }
