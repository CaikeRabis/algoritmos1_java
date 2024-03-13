package com.caike.exercicios2;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        //12.Tendo como dados de entrada a altura de uma pessoa, construa um
        //algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
        //(72.7*altura) - 58
        Scanner scanner = new Scanner(System.in);
        float altura, pesoIdeal;

        System.out.println("Cálculo peso IDEAL");
        System.out.print("Insira sua altura: ");
        altura = scanner.nextFloat();
        pesoIdeal = (72.7F * altura) - 58;

        System.out.print("Seu peso IDEAL seria de: " + pesoIdeal);
    }
}
