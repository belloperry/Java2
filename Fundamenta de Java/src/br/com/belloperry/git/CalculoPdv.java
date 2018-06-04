package br.com.belloperry.git;

import java.util.Scanner;

public class CalculoPdv {

	public static void main(String[] args) {
		double total, valorPago,desconto,totalDesconto,troco;
		Scanner teclado = new Scanner (System.in);
		System.out.println("calcular de desconto total");
		System.out.println("");
		System.out.print("Preco de Total: ");
		total = teclado.nextDouble();
		System.out.println("% de desconto: ");
		desconto = teclado.nextDouble();
		//processamento
		totalDesconto = total - ((total * desconto) / 100);
		System.out.println("Total com desconto: " + totalDesconto);
		System.out.println("___________________");
		System.out.println("valor pago");
		valorPago = teclado.nextDouble();
		troco = valorPago - totalDesconto;
		System.out.println("Troco: " + troco);
		
		
	}

}
