package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero:");
		double primeiroNumero = scan.nextDouble();
		
		System.out.println("Entre com o segundo n�mero:");
		double segundoNumero = scan.nextDouble();
		
		System.out.println("Entre com o terceiro n�mero:");
		double terceiroNumero = scan.nextDouble();
		
		if(primeiroNumero <= segundoNumero && primeiroNumero <= terceiroNumero && segundoNumero <= terceiroNumero) {
			//primeiro � menor
			//terceiro � maior
			//primeiro < segundo < terceiro
			System.out.println(terceiroNumero + " - " + segundoNumero + " - " + primeiroNumero + " - ");
		} else if (primeiroNumero <= segundoNumero && primeiroNumero <= terceiroNumero && terceiroNumero <= segundoNumero) {
			//primeiro � menor
			//segundo � maior
			//primeiro < terceiro < segundo
			System.out.println(segundoNumero + " - " + terceiroNumero + " - " + primeiroNumero + " - ");
		} else if (segundoNumero <= primeiroNumero && segundoNumero <= terceiroNumero && primeiroNumero <= terceiroNumero) {
			//segundo � menor
			//terceiro � maior
			//segundo < primeiro < terceiro
			System.out.println(terceiroNumero + " - " + primeiroNumero + " - " + segundoNumero + " - ");
		} else if (segundoNumero <= primeiroNumero && segundoNumero <= terceiroNumero && terceiroNumero <= primeiroNumero) {
			//segundo � menor
			//primeiro � maior
			//segundo < terceito < primeiro
			System.out.println(primeiroNumero + " - " + terceiroNumero + " - " + segundoNumero + " - ");
		} else if (terceiroNumero <= primeiroNumero && terceiroNumero <= segundoNumero && primeiroNumero <= segundoNumero) {
			//terceiro � menor
			//segundo � maior
			//terceiro < primeiro < segundo
			System.out.println(segundoNumero + " - " + primeiroNumero + " - " + terceiroNumero + " ");
		} else if (terceiroNumero <= primeiroNumero && terceiroNumero <= segundoNumero && segundoNumero <= primeiroNumero) {
			//terceiro � menor
			//primeiro � maior
			//terceiro < segundo < primeiro
			System.out.println(primeiroNumero + " - " + segundoNumero + " - " + terceiroNumero + " - ");
		}
		
	}

}
