package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número:");
		double primeiroNumero = scan.nextDouble();
		
		System.out.println("Entre com o segundo número:");
		double segundoNumero = scan.nextDouble();
		
		System.out.println("Entre com o terceiro número:");
		double terceiroNumero = scan.nextDouble();
		
		if(primeiroNumero <= segundoNumero && primeiroNumero <= terceiroNumero && segundoNumero <= terceiroNumero) {
			//primeiro é menor
			//terceiro é maior
			//primeiro < segundo < terceiro
			System.out.println(terceiroNumero + " - " + segundoNumero + " - " + primeiroNumero + " - ");
		} else if (primeiroNumero <= segundoNumero && primeiroNumero <= terceiroNumero && terceiroNumero <= segundoNumero) {
			//primeiro é menor
			//segundo é maior
			//primeiro < terceiro < segundo
			System.out.println(segundoNumero + " - " + terceiroNumero + " - " + primeiroNumero + " - ");
		} else if (segundoNumero <= primeiroNumero && segundoNumero <= terceiroNumero && primeiroNumero <= terceiroNumero) {
			//segundo é menor
			//terceiro é maior
			//segundo < primeiro < terceiro
			System.out.println(terceiroNumero + " - " + primeiroNumero + " - " + segundoNumero + " - ");
		} else if (segundoNumero <= primeiroNumero && segundoNumero <= terceiroNumero && terceiroNumero <= primeiroNumero) {
			//segundo é menor
			//primeiro é maior
			//segundo < terceito < primeiro
			System.out.println(primeiroNumero + " - " + terceiroNumero + " - " + segundoNumero + " - ");
		} else if (terceiroNumero <= primeiroNumero && terceiroNumero <= segundoNumero && primeiroNumero <= segundoNumero) {
			//terceiro é menor
			//segundo é maior
			//terceiro < primeiro < segundo
			System.out.println(segundoNumero + " - " + primeiroNumero + " - " + terceiroNumero + " ");
		} else if (terceiroNumero <= primeiroNumero && terceiroNumero <= segundoNumero && segundoNumero <= primeiroNumero) {
			//terceiro é menor
			//primeiro é maior
			//terceiro < segundo < primeiro
			System.out.println(primeiroNumero + " - " + segundoNumero + " - " + terceiroNumero + " - ");
		}
		
	}

}
