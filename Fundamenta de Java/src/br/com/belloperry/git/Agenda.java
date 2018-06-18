package br.com.belloperry.git;

public class Agenda {

	public static void main(String[] args) {
		String[][] agenda  = {{"Bill Gate","111-111","billgate@outlook.com"},{"Linus Torvald","222-222","linus@gmail.com"},
				{"Steve Jobs","333-333","steve!icloud.com"}}; 
		// recuperando o email do Linus Torvalds
		// system.out.println(agenda[1][2]);
		//alterando o  telefone do Bill gates
		//agenda[0][1] = "999-999";
		//System.out.println(agenda[0][1]);
		for (int i = 0; i < agenda.length; i++) {
			System.out.println("_________________");
			for (int j = 0; j < agenda[i].length; j++) {
				System.out.println(agenda[i][j]);
			}
		}
		

	}

}
