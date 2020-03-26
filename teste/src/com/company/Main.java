package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        String input = null;
        String input2 = null;
        Scanner scanner = new Scanner(System.in);
        boolean menu=true;
        while (menu) {
            System.out.println("!!!!Cadastro de animais Teste!!!! ");
            System.out.println("Escolha o animal de sua preferencia dado o menu");
            System.out.println("1 - Galinha");
            System.out.println("2 - Morcego");
            System.out.println("3 - Pato");
            System.out.println("4 - Vaca");
            System.out.println("0 - Sair");
            int op = scanner.nextInt();
            switch (op) {

                case 1:
                    System.out.println("Galinha.");
                    Galinha galinha = new Galinha(op, input, input);
                    System.out.println("Idade (em meses)? ");
                    galinha.setIdade(scanner.nextInt());
                    System.out.println("Tamanho (em cm)? ");
                    galinha.setTamanho(scanner.next());
                    System.out.println("Qual a cor? ");
                    galinha.setCorDaPena(scanner.next());
                    galinha.dadosGalinha();
                    System.in.read();
                    break;

                case 2:
                    System.out.println("Morcego.");
                    Morcego bat = new Morcego(op, input, input,op);
                    System.out.println("Idade (em meses)? ");
                    bat.setIdade(scanner.nextInt());
                    System.out.println("Tamanho (em cm)? ");
                    bat.setTamanho(scanner.next());
                    System.out.println("Qual a cor? ");
                    bat.setCorPelo(scanner.next());
                    System.out.println("Altura do voo (em metros)? ");
                    bat.setAltitude(scanner.nextInt());
                    bat.dadosMorcego();
                    System.in.read();
                    break;

                case 3:
                    System.out.println("Pato.");
                    Pato pato = new Pato(op, input, input,op);
                    System.out.println("Idade (em meses)? ");
                    pato.setIdade(scanner.nextInt());
                    System.out.println("Tamanho (em cm)? ");
                    pato.setTamanho(scanner.next());
                    System.out.println("Qual a cor? ");
                    pato.setCorDaPena(scanner.next());
                    System.out.println("Altura do voo (em metros)? ");
                    pato.setAltitude(scanner.nextInt());
                    pato.dadosPato();
                    System.in.read();
                    break;

                case 4:
                    System.out.println("Vaca.");
                    Vaca vaca = new Vaca(op, input, input);
                    System.out.println("Idade (em meses)? ");
                    vaca.setIdade(scanner.nextInt());
                    System.out.println("Tamanho (em cm)? ");
                    vaca.setTamanho(scanner.next());
                    System.out.println("Qual a cor? ");
                    vaca.setCorPelo(scanner.next());
                    vaca.dadosVaca();
                    System.in.read();

                    break;
                case 0:
                    System.out.println("end");
                    menu=false;
                    break;
                default:
                    System.out.println("Numero incorreto");

            }
        }

    }
}
