/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.patasamigas.model.DAOs;

import com.corespring.patasamigas.model.Funcionario;
import jakarta.enterprise.context.Dependent;

/**
 *
 * @author Erick
 */
@Dependent
public class funcionarioDAO extends GenericAbstractDAO<Funcionario, Integer>{

    @Override
    public Class<Funcionario> getEntityClass() {
        return Funcionario.class;
    }

}
