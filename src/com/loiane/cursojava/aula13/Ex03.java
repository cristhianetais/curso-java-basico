package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int segundoNumero = scan.nextInt();	
		
		int soma = primeiroNumero + segundoNumero;
		
		System.out.println("A soma dos números é: " + soma);
		
	}

}
