/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.patasamigas.utils;

import com.corespring.patasamigas.model.Animal;
import com.corespring.patasamigas.model.Funcionario;
import com.corespring.patasamigas.model.Tutor;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Produces;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Erick
 */
@Dependent
public class HibernateUtils {
     private static final  SessionFactory sessionFactory;
static{
       Configuration configuration = new Configuration();
        configuration.setProperty("hibernate.connection.username","erick" );
        configuration.setProperty("hibernate.connection.password", "erick");
        configuration.setProperty("hibernate.hbm2ddl.auto","update" );
        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MariaDBDialect");
        configuration.setProperty("hibernate.connection.driver_class", "org.mariadb.jdbc.Driver");
        configuration.setProperty("hibernate.connection.url", "jdbc:mariadb://localhost:3307/teste");
        configuration.addAnnotatedClass(Funcionario.class);
        configuration.addAnnotatedClass(Tutor.class);
        configuration.addAnnotatedClass(Animal.class);
        sessionFactory = configuration.buildSessionFactory();
}

    @Produces
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

