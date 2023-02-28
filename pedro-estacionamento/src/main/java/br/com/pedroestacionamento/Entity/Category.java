package br.com.pedroestacionamento.Entity;

public enum Category {
    car("carro"),
    van("van"),
    bike("moto");

    public final String value;

    private Category (String value){
        this.value = value;
    }
}
