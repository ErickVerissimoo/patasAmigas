/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patasamigas.model.DAOs;

import com.patasamigas.model.HistoricoMedico;

/**
 *
 * @author Erick
 */

public class HistoricoMedicoDAO extends GenericAbstractDAO<HistoricoMedico, Integer> {

    @Override
    public Class<HistoricoMedico> getEntityClass() {
        return HistoricoMedico.class;
    }
    
}
