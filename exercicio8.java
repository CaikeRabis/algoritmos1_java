package com.caike.exercicios2;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        //8. Faça um Programa que pergunte quanto você ganha por hora e o
        //número de horas trabalhadas no mês. Calcule e mostre o total do seu
        //salário no referido mês.
        Scanner scanner = new Scanner(System.in);
        double valorHora, horasMensais, salario;

        System.out.println("Cálculo Do Salário");
        System.out.println("");
        System.out.print("Insira o valor de sua Hora: ");
        valorHora = scanner.nextDouble();

        System.out.print("Insira as horas trabalhadas no mês: ");
        horasMensais = scanner.nextDouble();
        salario = valorHora * horasMensais;

        System.out.println("Salário: " + salario);
    }
}
