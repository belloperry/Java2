package br.com.belloperry.git;

import java.util.Scanner;

public class CalculadoraServico {

	public static void main(String[] args) {
		double remuneracao, custo, hora, servico, estimativo, total;
		Scanner teclado = new Scanner(System.in);
		System.out.println("_____Calculadora do Service_____");
		remuneracao = teclado.nextDouble();
		System.out.println("Custo operacional mesnal: ");
		custo = teclado.nextDouble();
		System.out.println("Cargo de horario mensal de trabalho: ");
		hora = teclado.nextDouble();
		servico = (remuneracao + (remuneracao *0.3) + custo + (remuneracao * 0.2)) / hora;
		System.out.println(" Valor da horas deste servico: " + servico);
		System.out.println(" ");
		System.out.println("Estimativo de horas de servico: ");
		estimativo = teclado.nextDouble();
		total = estimativo * servico;
		System.out.println(" Valor ser cobrado deste cliente: " + total);
		
		
		
		
		
	}

}
