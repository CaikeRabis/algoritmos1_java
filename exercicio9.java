package com.caike.exercicios2;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        //9. Faça um Programa que peça a temperatura em graus Farenheit,
        //transforme e mostre a temperatura em graus Celsius.
        Scanner scanner = new Scanner(System.in);
        double tempF, tempC;

        System.out.println("Conversão Temperatura");
        System.out.print("Informe a temperatura em Farenheit: ");
        tempF = scanner.nextDouble();
        tempC = (5 * (tempF - 32) / 9);

        System.out.print("Conversão:" + tempC + "°");
    }
}
