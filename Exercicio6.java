package com.caike.exercicios2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        //6. Faça um Programa que peça o raio de um círculo, calcule e mostre
        //sua área.
        Scanner scanner = new Scanner(System.in);
        double raio, areaCiruclo, pi = 3.14;

        System.out.println("Calculo do Raio do Circulo");
        System.out.print("Insira o raio do Circulo: ");
        raio = scanner.nextDouble();
        areaCiruclo = (raio * raio) * pi;

        System.out.println("Area do Circulo = " + areaCiruclo);
    }
}
