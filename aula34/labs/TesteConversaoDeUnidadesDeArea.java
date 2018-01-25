package aula34.labs;

import java.util.Scanner;

public class TesteConversaoDeUnidadesDeArea {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int opcao = -1;
		double num = 0;
		
		while(opcao != 0) {
		System.out.println("Qual opera��o deseja? ");
		System.out.println("1 - Converter Metro quadrado para p�s quadrados");
		System.out.println("2 - Converter P� quadrado para cent�metros quadrados");
		System.out.println("3 - Converter Milha quadrada para Acres");
		System.out.println("4 - Converter Acre para p�s quadrados");
		System.out.println("0 - Sair");
		opcao = scan.nextInt();
		
		System.out.println("Qual numero? ");
		num = scan.nextDouble();
		
		
		switch(opcao) {
		case 1: {
			System.out.println(num + " Metros quadrados equivalem a " + ConversaoDeUnidadesDeArea.converteMetroQuadradoParaPes(num) + " p�s quadrados");
			break;
		}
		case 2: {
			System.out.println(num + " P�s quadrados equivalem a " + ConversaoDeUnidadesDeArea.convertePeQuadradoParaCentimetroQuadrado(num) + " cent�metros quadrados");
			break;
		}
		case 3: {
			System.out.println(num + " Milhas quadradas equivalem a " + ConversaoDeUnidadesDeArea.converteMilhaQuadradaParaAcres(num) + " Acres");
			break;
		}
		case 4: {
			System.out.println(num + " Acres equivalem a " + ConversaoDeUnidadesDeArea.converteAcreParaPesQuadrados(num) + " p�s quadrados");
			break;
		}
		}
		
		}

	}

}
