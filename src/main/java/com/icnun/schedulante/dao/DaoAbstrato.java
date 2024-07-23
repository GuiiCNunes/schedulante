package com.icnun.schedulante.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.io.Serializable;

public abstract class DaoAbstrato implements DaoInterface {
    @PersistenceContext
    EntityManager entityManager;

    public void criar(Serializable entidade) {
        entityManager.persist(entidade);
    }
}
