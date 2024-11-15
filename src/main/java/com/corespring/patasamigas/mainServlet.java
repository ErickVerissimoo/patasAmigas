/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.patasamigas;

import com.corespring.patasamigas.model.Funcionario;
import com.corespring.patasamigas.model.Pessoa;
import com.corespring.patasamigas.service.FuncionarioService;
import com.corespring.patasamigas.utils.DatabaseUtils;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erick
 */
@WebServlet("/api")
public class mainServlet extends HttpServlet{
    @Inject
    private FuncionarioService serv;

    public mainServlet() {}
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Funcionario person = Funcionario.builder().nome("erickws").CPF("33030323s").email("erickverissimodasilva144@gmail").build();
        try {
            System.out.println(DatabaseUtils.exists(person));
        } catch (Throwable ex) {
            Logger.getLogger(mainServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
