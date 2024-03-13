package com.caike.exercicios2;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        //4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        Scanner scanner = new Scanner(System.in);

        double numberOne, numberTwo, numberThree, numberFor, media;

        System.out.println("NOTAS ESCOLA");
        System.out.print("Insira a 1° nota: ");
        numberOne = scanner.nextDouble();

        System.out.print("Insira a 2° nota: ");
        numberTwo = scanner.nextDouble();

        System.out.print("Insira a 3° nota: ");
        numberThree = scanner.nextDouble();

        System.out.print("Insira a 4° nota: ");
        numberFor = scanner.nextDouble();
        media = (numberOne + numberTwo + numberThree + numberFor) / 4;

        System.out.println("Sua media: " + media);
    }
}
