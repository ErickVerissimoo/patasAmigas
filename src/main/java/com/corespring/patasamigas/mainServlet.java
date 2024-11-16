/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.patasamigas;

import com.corespring.patasamigas.model.Adotante;
import com.corespring.patasamigas.model.Animal;
import com.corespring.patasamigas.model.Funcionario;
import com.corespring.patasamigas.model.Tutor;
import com.corespring.patasamigas.service.AdotanteService;
import com.corespring.patasamigas.service.AnimalService;
import com.corespring.patasamigas.service.FuncionarioService;
import com.corespring.patasamigas.service.TutorService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import jakarta.inject.Inject;


/**
 *
 * @author Erick
 */
@WebServlet("/api")
public class mainServlet extends HttpServlet{
    @Inject
    private FuncionarioService serv;
    @Inject
    private TutorService tot;
    @Inject
    private AnimalService service;
    @Inject
    private AdotanteService adot;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        tot.add(new Tutor());
        serv.add(new Funcionario());
        adot.add(new Adotante());
        service.add(new Animal());
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    

    }

    

}
    
    

