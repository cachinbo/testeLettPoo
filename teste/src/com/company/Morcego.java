    package com.company;

    public class Morcego extends Mamifero implements Voo  {
    private int altitude;

        public Morcego(int idade, String tamanho, String corPelo, int altitude) {
            super(idade, tamanho, corPelo);
            this.altitude = altitude;
        }

        public int getAltitude() {
            return altitude;
        }

        public void setAltitude(int altitude) {
            this.altitude = altitude;
        }

        @Override
        public void amamentar() {
            System.out.println(" Morcego dando leite");

        }

        @Override
        public void emiteSom() {
            System.out.println("Morcego farfalha");
        }

        @Override
        public void voar() {
            System.out.println("Morcego voando a " +this.getAltitude()+ " metros" );
        }
        public void dadosMorcego(){
            System.out.println("Novo Morcego cadastrado");
            System.out.println("Idade "+this.getIdade()+" meses");
            System.out.println("Tamanho "+this.getTamanho() + " cm");
            System.out.println("Cor "+this.getCorPelo());
            voar();
            emiteSom();
            amamentar();
        }
    }
