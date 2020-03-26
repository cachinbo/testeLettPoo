    package com.company;

    public class Galinha extends Ave{
        public Galinha(int idade, String tamanho, String corDaPena) {
            super(idade, tamanho, corDaPena);
        }

        @Override
        public void botaOvo() {
            System.out.println("Botou ovo "+this.getCorDaPena());
        }

        @Override
        public void emiteSom() {
            System.out.println("Galinha cacarejou");
        }
        public void dadosGalinha() {
            System.out.println("Nova Galinha cadastrada!");
            System.out.println("Idade " + this.getIdade() + " meses");
            System.out.println("Tamanho " + this.getTamanho() + " cm");
            System.out.println("Cor " + this.getCorDaPena());
            emiteSom();
            botaOvo();
        }
    }
