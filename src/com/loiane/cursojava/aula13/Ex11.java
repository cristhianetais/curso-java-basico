package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro: ");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
		int segundoNumero = scan.nextInt();
		
		System.out.println("Digite um número real: ");
		double terceiroNumero = scan.nextDouble();
		
		//a. O produto do dobro do primeiro com metade do segundo
		double resultadoA = (primeiroNumero * 2) * (segundoNumero / 2);
		
		//b. A soma do triplo do primeiro com o terceiro
		double resultadoB = (primeiroNumero * 3) + terceiroNumero;
		
		//c. O terceiro elevado ao cubo
		double resultadoC = Math.pow(terceiroNumero, 3);
		
		System.out.println("Resultado a: " + resultadoA);
		System.out.println("Resultado b: " + resultadoB);
		System.out.println("Resultado c: " + resultadoC);


	}

}
