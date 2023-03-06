package br.com.pedroestacionamento.Entity;

import org.springframework.beans.factory.annotation.Autowired;

public enum Category {
    carro("carro"),
    van("van"),
    bike("moto");

    public final String value;

    private Category (String value){
        this.value = value;
    }
}

