/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.patasamigas.model.DAOs;

import com.corespring.patasamigas.model.Funcionario;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Erick
 */
@ApplicationScoped
public class funcionarioDAO implements GenericDAO<Funcionario, Integer> {
    @Inject
    private Session sessao;
  
     
     

    @Override
    public void add(Funcionario entity) {
       
        sessao.beginTransaction();
        sessao.persist(entity);
        sessao.getTransaction().commit();
    }

    @Override
    public void update(Funcionario entity) {

        sessao.beginTransaction();
        sessao.merge(entity);
        sessao.getTransaction().commit();
    }

    @Override
    public List<Funcionario> getAll() {

        return sessao.createNativeQuery("Select * from funcionario", Funcionario.class).list();
    }

    @Override
    public Funcionario get(Integer id) {
        
        if(sessao.find(Funcionario.class, id)!= null){
        return sessao.get(Funcionario.class, id);
        }
        throw new EntityNotFoundException("Entidade não existe");
    }

    @Override
    public void delete(Integer id) {

        sessao.beginTransaction();
        if(this.get(id) !=null){
                    sessao.remove(this.get(id));

        }
        sessao.getTransaction().commit();
    }
    
}
