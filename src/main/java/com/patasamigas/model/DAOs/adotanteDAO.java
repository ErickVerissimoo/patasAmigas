/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patasamigas.model.DAOs;

import com.patasamigas.model.Adotante;
import jakarta.enterprise.context.Dependent;

/**
 *
 * @author Erick
 */
@Dependent
public class adotanteDAO extends pessoaDAO<Adotante, Integer> {

    @Override
    public Class<Adotante> getEntityClass() {
        return Adotante.class;
    }
    
}
