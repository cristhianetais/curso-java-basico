package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o salário: ");
		double salario = scan.nextDouble();
		double percentual;
		
		if(salario <= 280) {
			percentual = 20;
		} else if(salario > 280 && salario < 700) {
			percentual = 15;
		} else if(salario >= 700 && salario < 1500) {
			percentual = 10;
		} else {
			percentual = 5;
		}
		
		System.out.println("Salário antes do reajuste: " + salario);
		System.out.println("Percentual do aumento aplicado: " + percentual + "%");
		System.out.println("O valor do aumento: " + (( salario * percentual) / 100));
		System.out.println("Novo salário após aumento: " + (salario + (( salario * percentual) / 100)));

	}

}
