package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com valor do metro:");
		double metro = scan.nextDouble();
		
		double centimetros = metro * 100;
		
		System.out.println(metro + "m é igual a " + centimetros + "cm");

	}

}
