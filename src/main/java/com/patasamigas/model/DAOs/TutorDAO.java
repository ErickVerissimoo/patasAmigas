/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patasamigas.model.DAOs;

import com.patasamigas.model.Tutor;
import jakarta.enterprise.context.Dependent;

/**
 *
 * @author Erick
 */
@Dependent
public class TutorDAO extends GenericAbstractDAO<Tutor, Integer>{

    @Override
    public Class<Tutor> getEntityClass() {
        return Tutor.class;
    }
    
}
