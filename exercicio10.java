package com.caike.exercicios2;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        //10.Faça um Programa que peça a temperatura em graus Celsius,
        //transforme e mostre em graus Farenheit.
        Scanner scanner = new Scanner(System.in);
        double tempC, tempF;

        System.out.println("Conversor");
        System.out.print("Insira a temperatura em Celsius: ");
        tempC = scanner.nextDouble();
        tempF = (tempC * 1.8) + 32;

        System.out.println("Temperatura em Farenheit = " + tempF);
    }
}
