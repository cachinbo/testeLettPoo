package com.company;

public abstract class Ave extends Animal {
    private String corDaPena;

    public Ave(int idade, String tamanho, String corDaPena) {
        super(idade, tamanho);
        this.corDaPena = corDaPena;
    }

    public abstract void botaOvo();

    public String getCorDaPena() {
        return corDaPena;
    }

    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
    }
}
