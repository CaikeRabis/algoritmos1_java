package com.caike.exercicios2;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        //7. Faça um Programa que calcule a área de um quadrado, em seguida
        //mostre o dobro desta área para o usuário.
        Scanner scanner = new Scanner(System.in);
        double lado, areaQuadrado;

        System.out.print("Insira o valor do L: ");
        lado = scanner.nextDouble();
        areaQuadrado = lado * 4;

        System.out.println("Valor Final = " + areaQuadrado * 2);
    }
}
