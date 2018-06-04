package br.com.belloperry.git;

import java.util.Scanner;

public class CalculadoraLucro {

	public static void main(String[] args) {
		double custo, lucro, venda;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Calculadora do lucro");
		System.out.println("");
		System.out.println("Preco de custo: ");
		custo = teclado.nextDouble();
		System.out.println("% de lucro: ");
		lucro = teclado.nextDouble();
		// processamento
		venda = custo + ((custo * lucro) /100);
		// saida
		System.out.println("Preco de venda: " + venda);
	}

}
