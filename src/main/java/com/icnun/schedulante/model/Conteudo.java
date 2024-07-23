package com.icnun.schedulante.model;

import java.io.Serializable;

public class Conteudo implements Serializable {
    private String link;
    public Conteudo(){}

    public Conteudo(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
