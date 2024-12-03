/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patasamigas.utils;

import com.patasamigas.model.Adotante;
import com.patasamigas.model.Animal;
import com.patasamigas.model.Funcionario;
import com.patasamigas.model.HistoricoMedico;
import com.patasamigas.model.Preferencias;
import com.patasamigas.model.Tutor;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Produces;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@Dependent
public class HibernateUtils {
     private  SessionFactory sessionFactory = getSession();
     
     public SessionFactory getSession(){
       Configuration configuration = new Configuration();
        configuration.setProperty("hibernate.connection.username","erick" );
        configuration.setProperty("hibernate.connection.password", "erick");
        configuration.setProperty("hibernate.hbm2ddl.auto","update" );
        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MariaDBDialect");
        configuration.setProperty("hibernate.connection.driver_class", "org.mariadb.jdbc.Driver");
        configuration.setProperty("hibernate.connection.url", "jdbc:mariadb://localhost:3306/teste");
        configuration.addAnnotatedClass(Funcionario.class);
        configuration.addAnnotatedClass(Tutor.class);
        configuration.addAnnotatedClass(Animal.class);
        configuration.addAnnotatedClass(Adotante.class);
        configuration.addAnnotatedClass(Preferencias.class);
        configuration.addAnnotatedClass(HistoricoMedico.class);
        return configuration.buildSessionFactory();
}

    @Produces
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

