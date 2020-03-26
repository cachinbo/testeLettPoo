    package com.company;

    public abstract class Animal {
       private int idade;
        private String tamanho;

        public abstract void emiteSom();

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public String getTamanho() {
            return tamanho;
        }

        public void setTamanho(String tamanho) {
            this.tamanho = tamanho;
        }

        public Animal(int idade, String tamanho) {
            this.idade = idade;
            this.tamanho = tamanho;
        }

        public String toString(){
            return "Idade do animal "+idade+" tamanho"+tamanho ;
        }
    }
