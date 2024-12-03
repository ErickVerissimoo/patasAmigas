
package com.patasamigas;

import com.patasamigas.model.Adotante;
import com.patasamigas.model.DAOs.adotanteDAO;
import com.patasamigas.service.AdotanteService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import jakarta.inject.Inject;
import jakarta.servlet.ServletOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


/**
 *
 * @author Erick
 */
@WebServlet("/adotante")
public class mainServlet extends HttpServlet{

    @Inject
    private AdotanteService adot;
    @Inject
    private adotanteDAO dao;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

      
         
            StringBuilder builder = new StringBuilder();
            for(Adotante adotant : adot.getAll()){
                builder.append(adotant.toString()).append("\n");
            }
                resp.setContentType("text/plain");
                resp.setStatus(HttpServletResponse.SC_ACCEPTED);
                try(PrintWriter writer = resp.getWriter()){
                writer.write("Itens totais");
                writer.write(builder.toString());
                } 
            }
       
    

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/plain");
    
    try (ServletOutputStream saida = resp.getOutputStream()) {
        String cpf = req.getParameter("cpf");
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");
        String telefone = req.getParameter("telefone");
        String dataNascimentoStr = req.getParameter("data");

        if (cpf == null || email == null || senha == null || telefone == null || dataNascimentoStr == null) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            saida.write("Parâmetros inválidos ou ausentes".getBytes());
            return;
        }

        LocalDate dataNascimento;
        try {
            dataNascimento = LocalDate.parse(dataNascimentoStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch (DateTimeParseException e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            saida.write("Formato de data inválido".getBytes());
            return;
        }

        Adotante adotante = Adotante.builder()
            .cpf(cpf)
            .email(email)
            .senha(senha)
            .telefone(telefone)
            .dataNascimento(dataNascimento)
            .build();
        adot.add(adotante);
        saida.write("Usuário adicionado com sucesso!".getBytes());
    
}}


    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id =Integer.valueOf(req.getParameter("id"));
        adot.delete(id);
        try(ServletOutputStream saida = resp.getOutputStream()){
            saida.write("Usuário deletado com sucesso".getBytes());
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletOutputStream saida = resp.getOutputStream();
        
        String cpf = req.getParameter("cpf");
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");
        String telefone = req.getParameter("telefone");
        String dataNascimentoStr = req.getParameter("data");
  LocalDate dataNascimento;
        try {
            dataNascimento = LocalDate.parse(dataNascimentoStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch (DateTimeParseException e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            saida.write("Formato de data inválido".getBytes());
            return;
        }
        Adotante adotante = Adotante.builder()
            .cpf(cpf)
            .email(email)
            .senha(senha)
            .telefone(telefone)
            .dataNascimento(dataNascimento)
            .build();
        adotante.setId(dao.findIdByEmail(email));
        adot.update(adotante);
    }

    

}
    
    

