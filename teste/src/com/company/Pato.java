    package com.company;

    public class Pato extends Ave implements Voo{

        private int altitude;

        public Pato(int idade, String tamanho, String corDaPena, int altitude) {
            super(idade, tamanho, corDaPena);
            this.altitude = altitude;
        }

        public int getAltitude() {
            return altitude;
        }

        public void setAltitude(int altitude) {
            this.altitude = altitude;
        }

        @Override
        public void botaOvo() {
            System.out.println("Botou um ovo "+this.getCorDaPena());
        }

        @Override
        public void emiteSom() {
            System.out.println("Pato grasnando");
        }


        public void dadosPato(){
            System.out.println("Novo Pato cadastrado");
            System.out.println("Idade "+this.getIdade()+" meses");
            System.out.println("Tamanho "+this.getTamanho() + " cm");
            System.out.println("Cor "+this.getCorDaPena());
            voar();
            emiteSom();
            botaOvo();

        }
        @Override
        public void voar() {
            System.out.println("Pato voando a " +this.getAltitude()+ " metros" );
        }
    }
