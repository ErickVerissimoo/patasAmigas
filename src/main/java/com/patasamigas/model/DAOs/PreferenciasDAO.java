/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patasamigas.model.DAOs;

import com.patasamigas.model.Preferencias;

/**
 *
 * @author Erick
 */
public class PreferenciasDAO extends GenericAbstractDAO<Preferencias, Integer> {

    @Override
    public Class<Preferencias> getEntityClass() {
        return Preferencias.class;
    }
    
}
