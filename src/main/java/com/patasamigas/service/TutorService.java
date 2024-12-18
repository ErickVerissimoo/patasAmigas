/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patasamigas.service;

import com.patasamigas.model.DAOs.TutorDAO;
import com.patasamigas.model.Tutor;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;


/**
 *
 * @author Erick
 */
@ApplicationScoped
public class TutorService extends GenericAbstractService<Tutor, Integer, TutorDAO>{
    @Inject
    public TutorService(TutorDAO dao) {
        super(dao);
    }
    public TutorService(){
    }
}
