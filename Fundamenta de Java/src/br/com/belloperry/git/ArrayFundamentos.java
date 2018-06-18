package br.com.belloperry.git;

public class ArrayFundamentos {

	public static void main(String[] args) {
		String time1 = "Corintians";
		String time2 = "Palmeiras";
		String time3 = "Santos";
		String time4 = "Sao Paulo";
		System.out.println("Fundamentos do array");
		System.out.println("Exemplo 1: Sem array");
		System.out.println("Time: " + time3);
		// a linha abaixo cria um valor simple
		String[] times = {"Corintians","Palmeiras", "Santos","Sao Paulo"};
		System.out.println("Exemplo 2: com array");
		// a linha baixo recupera o conteudo do indice [2] do array 
		System.out.println("Time: " + times[2]);
		// a linha abaixo modifica a contendo do indica [2] do array
		times[2] = "Flamengo";
	    System.out.println("Exemplo 3: modificando um array");
		System.out.println("Time: " + times[2]);
		// obtendo o tamanho total do array
		System.out.println("Total de times: " + times.length);
	}

}
