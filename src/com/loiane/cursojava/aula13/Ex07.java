package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com valor do lado:");
		double ladoQuadrado = scan.nextDouble();
		
		double areaQuadrado = Math.pow(ladoQuadrado, 2);
		
		System.out.println("A área do quadrado é: " + areaQuadrado);
		System.out.println("O dobro da área é: " + (areaQuadrado * 2));
		
		

	}

}
