package br.senai.sp.jandira.model;

import java.util.Scanner;

public class LojaDoces {

    Scanner teclado = new Scanner(System.in);
    String tipoDoce, corDoce, temaDoce;

    public static void fazerEncomenda(){

        System.out.println("Qual doce vai querer? ");
        tipoDoce = teclado.nextLine();
        System.out.println();
        System.out.println("Qual vai ser a cor da decoração? ");
        corDoce = teclado.nextLine();
        System.out.println();
        System.out.println("Qual o tema do seu doce?");
        temaDoce = teclado.nextLine();

    }
}
