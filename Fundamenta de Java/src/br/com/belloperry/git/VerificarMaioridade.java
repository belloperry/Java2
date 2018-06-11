package br.com.belloperry.git;

import java.util.Scanner;

public class VerificarMaioridade {

	public static void main(String[] args) {
		String nome;
		int idade;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu nome");
		nome = teclado.nextLine();
		System.out.println("Digite a sua idade");
		idade = teclado.nextInt();
		System.out.println(" ");
		System.out.println("-----------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		if (idade < 19) {
			System.out.println("Menor de Idade");
			
		} else {
			System.out.println("Maior de Idade");

		}

	}

}
