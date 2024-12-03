/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patasamigas.service;

import com.patasamigas.model.Animal;
import com.patasamigas.model.DAOs.animalDAO;
import jakarta.enterprise.context.ApplicationScoped;
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
