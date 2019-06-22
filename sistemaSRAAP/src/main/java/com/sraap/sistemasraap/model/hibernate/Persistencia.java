package com.sraap.sistemasraap.model.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Persistencia extends Persistence{

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("sraap");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
