package br.com.pedroestacionamento.Entity;

public enum Color {
    fantasy("fantasia"),
    blue("azul"),
    black("preto"),
    white("branco"),
    red("vermelho"),
    silver("prata"),
    yellow("amarelo"),
    beige("bege"),
    grey("cinza"),
    golden("dourado"),
    grana("grena"),
    orange("laranja"),
    brown("marrom"),
    pink("rosa"),
    purple("roxo"),
    green("verde");

    public final String value;

    private Color (String value){
        this.value = value;
    }

}
