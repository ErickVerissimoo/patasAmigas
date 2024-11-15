package com.corespring.patasamigas.utils;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SessionProducer {

    @Inject
    private SessionFactory sessionFactory;

    @Produces
    @RequestScoped
    public Session produceSession() {
        return sessionFactory.openSession();
    }
}
