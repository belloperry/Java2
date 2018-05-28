package br.com.belloperry.git;

import java.util.Scanner;

public class Calcalumc {

	public static void main(String[] args) {
		// alinha abaixo cria variaveis numericas de precisao
		// float e double sao tipos primitivos numericos
		double peso,altura,imc;
		// entrada
		System.out.println("=========Calculo do IMC=========: ");
		System.out.print("digite a peso: ");
		// a linha abaixo uso objeto nome teclado usando o scanner
		Scanner teclado = new Scanner(System.in);
		// a linha abaixo uso objeto teclado para captura o que foi
		// digitado no console e armazenar na variavel peso
		peso = teclado.nextDouble();
		System.out.print("digite a altura: ");
		altura = teclado.nextDouble();
		// processamento
		imc = peso/ (altura * altura);
		// saida
		// + concatena(junta) um texto com o conteudo da variavel IMC
		System.out.println("imc final:" +imc);
		
		

	}

}
