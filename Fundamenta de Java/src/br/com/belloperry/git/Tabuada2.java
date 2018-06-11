package br.com.belloperry.git;

import java.util.Scanner;

public class Tabuada2 {

	public static void main(String[] args) {
		int valor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("________ TABUADA _________");
		System.out.println("");
		System.out.println("Digite o valor da tabuada");
		valor = teclado.nextInt();
		System.out.println("");
		for  (int i = 1; i < 11; i++); {
			int i = 1;
			System.out.println(valor + " x " +  " = " + (valor * i));
		}

	}

}
