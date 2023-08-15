package br.senai.sp;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        /** Declara variaveis */
        int number = 0;

        /** Instancia teclado */
        Scanner teclado = new Scanner(System.in);

        while (number%2==0) {
            /** Coleta dados */
            System.out.println("________________________________");
            System.out.print("Digite um número: ");
            number = teclado.nextInt();
        }
    }
}
