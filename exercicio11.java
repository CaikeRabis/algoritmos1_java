package com.caike.exercicios2;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        //11.Faça um Programa que peça 2 números inteiros e um número real.
        //Calcule e mostre:
          //a. o produto do dobro do primeiro com metade do segundo .
          //b. a soma do triplo do primeiro com o terceiro.
          //c. o terceiro elevado ao cubo.
        Scanner scanner = new Scanner(System.in);
        int numberOne, numberTwo;
        double numberThree;

        System.out.print("Insira o 1° número: ");
        numberOne = scanner.nextInt();
        System.out.print("Insira o 2° número: ");
        numberTwo = scanner.nextInt();
        System.out.print("Insira o 3° número: ");
        numberThree = scanner.nextInt();

        System.out.println("A = " + ((numberOne * 2) * (numberTwo / 2)));
        System.out.println("B = " + ((numberOne * 3) + numberThree));
        System.out.println("C = " + (Math.pow(numberThree, 3)));
    }
}
