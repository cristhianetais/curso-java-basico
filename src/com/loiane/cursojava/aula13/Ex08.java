package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com valor hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre com horas trabalhadas: ");
		double horas = scan.nextDouble();
		
		double rendaMensal = valorHora * horas;
		
		System.out.println("Sua renda mensal é de R$ " + rendaMensal);
		
	}

}
