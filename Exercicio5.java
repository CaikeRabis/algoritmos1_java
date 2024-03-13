package com.caike.exercicios2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //5. Faça um Programa que converta metros para centímetros.
        Scanner scanner = new Scanner(System.in);
        double valueMetros, valueEmCM;

        System.out.println("CONVERSOR DE METROS");
        System.out.print("Insira o valor (M): ");
        valueMetros = scanner.nextDouble();

        valueEmCM = valueMetros * 100;
        System.out.println("Valor convertido: " + valueEmCM + " cm");
    }
}
