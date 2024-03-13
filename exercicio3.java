package com.caike.exercicios2;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        //3. Faça um Programa que peça dois números e imprima a soma.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        double numberOne = scanner.nextDouble();

        System.out.print("Insira um número: ");
        double numberTwo = scanner.nextDouble();

        double soma = numberOne + numberTwo;
        System.out.println("SOMA: " + soma);
    }
}
