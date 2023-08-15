package br.senai.sp;

/**
 * Par e Impar
 * Data: 15/08/2023
 * Autor: Guilherme Pereira*/

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        /** Declara variaveis */
        int number = 1;

        /** Instancia teclado */
        Scanner teclado = new Scanner(System.in);

        while (number%2!=0) {
            /** Coleta dados */
            System.out.println("________________________________");
            System.out.print("Digite um número: ");
            number = teclado.nextInt();
        }
    }
}
