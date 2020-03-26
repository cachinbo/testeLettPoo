package com.company;

public class Vaca extends Mamifero {
    public Vaca(int idade, String tamanho, String corPelo) {
        super(idade, tamanho, corPelo);
    }


    @Override
    public void amamentar() {
        System.out.println("Vaca dando leite");
    }

    @Override
    public void emiteSom() {
        System.out.println("Vaca mugiu");
    }
    public void dadosVaca() {
        System.out.println("Nova Vaca cadastrada");
        System.out.println("Idade " + this.getIdade() + " meses");
        System.out.println("Tamanho " + this.getTamanho() + " cm");
        System.out.println("Cor " + this.getCorPelo());
        emiteSom();
        amamentar();
    }
}
