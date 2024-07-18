package com.icnun.schedulante.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class TestConteudo {
    @Nested
    @DisplayName("Testa a inicializacao")
    class TestInicializacao {
        @Test
        @DisplayName("Testa a inicialização da classe sem parâmetros")
        public void testaInicializacaoDaClasse() {
            Object conteudo = new Conteudo();
            assertInstanceOf(Conteudo.class, conteudo);
        }
    }
}
