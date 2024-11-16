/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.patasamigas.service;

import com.corespring.patasamigas.model.Animal;
import com.corespring.patasamigas.model.DAOs.GenericAbstractDAO;
import com.corespring.patasamigas.model.DAOs.animalDAO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

/**
 *
 * @author Erick
 */
@ApplicationScoped
public class AnimalService extends GenericAbstractService<Animal, Integer, animalDAO> {
    @Inject
    public AnimalService(animalDAO dao){
    super(dao);
    }
    public AnimalService(){
        
    }
}
