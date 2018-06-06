package br.com.belloperry.git;

import java.util.Scanner;

public class CalculadoraFlex {

	public static void main(String[] args) {
		double alcool;
		double gasolina;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor do alcool: ");
		alcool = teclado.nextDouble();
		System.out.println("Digite o valor da gasolina: ");
		gasolina = teclado.nextDouble();
		if (alcool < 0.7 * gasolina) {
			System.out.println("Abastecer com alcool");
			
		} else {
			System.out.println("Abastecer com gasolina");

		}
	}

}
