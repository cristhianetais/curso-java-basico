package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em Celsius:");
		double tempCelsius = scan.nextDouble();
		
		double tempFarenheit = (tempCelsius * 1.8) + 32;
		
		System.out.println("A temperatura " + tempCelsius + "C é igual a " + tempFarenheit + "F");
	}

}
