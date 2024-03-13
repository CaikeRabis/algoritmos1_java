package com.caike.exercicios2;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        //13.Tendo como dados de entrada a altura e o sexo de uma pessoa,
        //construa um algoritmo que calcule seu peso ideal, utilizando as
        //seguintes fórmulas:
        //. Para homens: (72.7*h) - 58
        //a. Para mulheres: (62.1*h) - 44.7 (h = altura)
        //b. Peça o peso da pessoa e informe se ela está dentro, acima ou
        //abaixo do peso.
        Scanner scanner = new Scanner(System.in);
        double altura, peso;
        char sexo;

        System.out.println("Cálculo peso ideal.");

        System.out.print("Informe seu sexo [F/M]: ");
        sexo = scanner.next().charAt(0);
        System.out.print("Informe sua altura: ");
        altura = scanner.nextDouble();
        System.out.print("Informe seu peso: ");
        peso = scanner.nextDouble();

        double pesoIdealM = 72.7 * altura - 58;
        double pesoIdealF = 62.1 * altura - 44.7;
        boolean condicaoPesoM = (pesoIdealM == peso);
        boolean condicaoPesoF = (pesoIdealF == peso);

        System.out.println("Para homens: " + pesoIdealM);
        System.out.println("Estaria no peso ideal? " + condicaoPesoM);
        System.out.println("Para mulheres: " + pesoIdealF);
        System.out.println("Estaria no peso ideal? " + condicaoPesoF);
    }
}
