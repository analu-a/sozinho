package br.senai.sp.jandira.model;

import java.util.Scanner;

import static br.senai.sp.jandira.model.LojaDoces.fazerEncomenda;

public class Menu {

    public void Menu{


    Scanner teclado = new Scanner(System.in);
    int resposta;
    public void menuEscolha() {

            System.out.println("********* Bem vindo(a) a confeitaria Ana *********");

            System.out.println("----- O que deseja? -----");

            System.out.println("[1] - Fazer encomenda");
            System.out.println("[2] - Escolher produto");
            System.out.println("[3] - Ver pedidos para retirada");
            System.out.println("[4] - Sair");
            resposta = teclado.nextInt();
            teclado.nextLine();

            if (resposta == 1) {
                LojaDoces loja = new LojaDoces();
                loja.fazerEncomenda();
            }

        }
    }

}
