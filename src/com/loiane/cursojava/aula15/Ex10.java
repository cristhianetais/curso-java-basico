package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o turno que você estuda (M-Matutino V-Vespertino N-Noturno): ");
		String turno = scan.next();
		
		/*if(turno.equalsIgnoreCase("m")) {
			System.out.println("Bom dia!");
		} else if (turno.equalsIgnoreCase("v")) {
			System.out.println("Boa tarde!");
		} else if (turno.equalsIgnoreCase("N")) {
			System.out.println("Boa noite!");
		} else {
			System.out.println("Dado inválido!");
		}*/
		
		switch(turno) {
			case "m" :
			case "M" : System.out.println("Bom dia!"); break;
			case "v" : 
			case "V" : System.out.println("Boa tarde!"); break;
			case "n" : 
			case "N" : System.out.println("Boa noite!"); break;
			default : System.out.println("Dado inválido!");
		}
		
	}

}
