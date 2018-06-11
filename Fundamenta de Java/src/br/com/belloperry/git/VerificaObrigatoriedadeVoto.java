package br.com.belloperry.git;

import java.util.Scanner;

public class VerificaObrigatoriedadeVoto {

	public static void main(String[] args) {
		int idade;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Verificar obrigatoriedade de votar");
		System.out.println("Digite a sua idade: ");
		idade = teclado.nextInt();
		/* Criterios
		 * Menor que 16 anos - proibido votar
		 * 16, 17 ou acima de 70 - voto facultativo 
		 * Entre 18 e 70 - Obrigatorio votar
		 * 
		 * 
		 */
		if (idade < 16) {
			System.out.println("Proibido votar");
			
		} else if (idade == 16 || idade == 17 || idade > 70); {
			System.out.println("Voto Facultativo");
			}

		else {
			System.out.println("Voto Obrigatorio");
		}
		}	
	
	}


