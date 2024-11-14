/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.patasamigas.utils;

import com.corespring.patasamigas.model.Funcionario;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Erick
 */
@ApplicationScoped
public class HibernateUtils {
     private final SessionFactory sessionFactory;

    public HibernateUtils() {
        Configuration configuration = new Configuration();
        configuration.setProperty("hibernate.connection.username","erick" );
        configuration.setProperty("hibernate.connection.password", "erick");
        configuration.setProperty("hibernate.hbm2ddl.auto","update" );
        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MariaDBDialect");
        configuration.setProperty("hibernate.connection.driver_class", "org.mariadb.jdbc.Driver");
        configuration.setProperty("hibernate.connection.url", "jdbc:mariadb://localhost:3307/teste");
        configuration.addAnnotatedClass(Funcionario.class);
        this.sessionFactory = configuration.buildSessionFactory();
    }

    @Produces
    @ApplicationScoped
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

