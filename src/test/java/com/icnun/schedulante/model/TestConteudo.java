package com.icnun.schedulante.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class TestConteudo {
    final String linkExemplo1 = "www.google.com";

    @Nested
    @DisplayName("Testa a inicializacao")
    class TestInicializacao {
        @Test
        @DisplayName("Testa a inicialização da classe sem parâmetros")
        public void testaInicializacaoDaClasse() {
            Object conteudo = new Conteudo();
            assertInstanceOf(Conteudo.class, conteudo);
        }
        @Test
        @DisplayName("Testa o construtor com link")
        public void testaConstructorLink() {
            Conteudo conteudo = new Conteudo(linkExemplo1);
            assertInstanceOf(Conteudo.class, conteudo);
            assertEquals(linkExemplo1, conteudo.getLink());
        }
    }

    @Nested
    @DisplayName("Testa os atributos da classe")
    class TestAtributos {
        @Test
        @DisplayName("Teste do atributo Link")
        public void testaInicializacaoDaClasse() {
            Conteudo conteudo = new Conteudo();
            conteudo.setLink(linkExemplo1);
            assertEquals(linkExemplo1, conteudo.getLink());
        }
    }
}
