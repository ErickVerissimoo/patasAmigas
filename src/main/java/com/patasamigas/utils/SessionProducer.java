package com.patasamigas.utils;

import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



@Dependent
public class SessionProducer {

    @Inject
    private SessionFactory sessionFactory;

    @Produces
    public Session produceSession() {
        return sessionFactory.openSession();
    }
}
