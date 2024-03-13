package com.caike.exercicios2;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        //2. Faça um Programa que peça um número e então mostre a
        //mensagem O número informado foi [número].
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        float number = scanner.nextFloat();

        System.out.println("O numero informado foi: " + number);
    }
}
