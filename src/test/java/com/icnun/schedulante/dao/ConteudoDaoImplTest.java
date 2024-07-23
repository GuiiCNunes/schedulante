package com.icnun.schedulante.dao;

import com.icnun.schedulante.model.Conteudo;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ConteudoDaoImplTest {
    private AutoCloseable closeable;

    @Mock
    private EntityManager entityManager;

    @InjectMocks
    private com.icnun.schedulante.dao.impl.ConteudoDaoImpl conteudoDao;

    @BeforeEach
    public void openMocks() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    public void releaseMocks() throws Exception {
        closeable.close();
    }

    @Test
    public void testeCriarConteudo() {
        Conteudo conteudo = new Conteudo();
        conteudoDao.criar(conteudo);
        verify(entityManager, times(1)).persist(conteudo);
    }
}
