package com.company;

public abstract class Mamifero extends Animal {

    private String corPelo;

    public Mamifero(int idade, String tamanho, String corPelo) {
        super(idade, tamanho);
        this.corPelo = corPelo;
    }

    public abstract void amamentar();

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
