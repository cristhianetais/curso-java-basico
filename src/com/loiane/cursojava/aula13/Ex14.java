package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do arquivo para download: ");
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.println("Entre com a velocida do link de internet: ");
		double velocidadeInternet = scan.nextDouble();
		
		double tempoAproximado = tamanhoArquivo / velocidadeInternet;
		
		System.out.println("Tempo aproximado de download: " + tempoAproximado);

	}

}
