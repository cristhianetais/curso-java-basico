package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com valor hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre com horas trabalhadas: ");
		double horas = scan.nextDouble();
		
		double rendaBruta = valorHora * horas;
		
		double IR = (rendaBruta / 100) * 11;
		double INSS = (rendaBruta / 100) * 8;
		double sindicato = (rendaBruta / 100) * 5;
		double totalDescontos = IR + INSS + sindicato;
		double rendaLiquida = rendaBruta - totalDescontos;
		
		System.out.println("Sua renda bruta é de R$ " + rendaBruta);
		System.out.println("Pagou de IR R$ " + IR);
		System.out.println("Pagou de INSS R$ " + INSS);
		System.out.println("Pagou de Sindicato R$ " + sindicato);
		System.out.println("Total de descontos R$ " + totalDescontos);
		System.out.println("Sua renda líquida é de R$ " + rendaLiquida);

	}

}
