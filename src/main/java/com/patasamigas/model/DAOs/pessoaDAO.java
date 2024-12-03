/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patasamigas.model.DAOs;

import com.patasamigas.model.superclasses.Pessoa;
import jakarta.persistence.EntityNotFoundException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Erick
 * @param <T>
 * @param <ID>
 */
public abstract class pessoaDAO<T extends Pessoa, ID extends Number> extends GenericAbstractDAO<T, ID> {
   public ID findIdByEmail(String email){
       Session sessao = this.getSessao();
       String nome = this.getEntityClass().getSimpleName();
       Query<ID> find = sessao.createQuery("select u.id from " + nome+ " u where u.email=:email", getIdClass());
       find.setParameter("email", email);
       return find.uniqueResultOptional().orElseThrow(() -> new RuntimeException("Entidade não existe"));
   }
   
   public Class<ID> getIdClass(){
       Type taipe = this.getClass().getGenericSuperclass();
       ParameterizedType parame = (ParameterizedType) taipe;
       return (Class<ID>) parame.getActualTypeArguments()[1];
   }
   
}
