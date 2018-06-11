package br.com.belloperry.git;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		int opcao;
		Scanner teclado = new Scanner(System.in);
		System.out.println("1. Windowss");
		System.out.println("2. Windowss");
		System.out.print("Digite a opcao desejada: ");
		opcao = teclado.nextInt();
		switch (opcao) {
		case 1:
			windows();
			break;
		case 2:
			linux();
			break;
		default:
			System.out.println("Opcao invalida");
			break;
		}
	}
	//Criano um metodo
	static void windows() {
		System.out.println("Carregado o  Windows........");
	}
	static void linux() {
		System.out.println("carregada Linux............");
	
	}

}
