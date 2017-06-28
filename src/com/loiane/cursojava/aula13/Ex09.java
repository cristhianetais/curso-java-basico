package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em Farenheit:");
		double tempFerenheit = scan.nextDouble();
		
		double tempCelsius = (5 * (tempFerenheit - 32) / 9);
		
		System.out.println("A temperatura " + tempFerenheit + " F é igual a " + tempCelsius + " C");

	}

}
