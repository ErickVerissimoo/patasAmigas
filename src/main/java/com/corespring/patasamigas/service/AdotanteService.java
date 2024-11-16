/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.patasamigas.service;

import com.corespring.patasamigas.model.Adotante;
import com.corespring.patasamigas.model.DAOs.GenericAbstractDAO;
import com.corespring.patasamigas.model.DAOs.adotanteDAO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

/**
 *
 * @author Erick
 */
@ApplicationScoped
public class AdotanteService extends GenericAbstractService<Adotante, Integer, adotanteDAO> {
    @Inject
    public AdotanteService(adotanteDAO dao){
        super(dao);
    }
    public AdotanteService(){}
}
