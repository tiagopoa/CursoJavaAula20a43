package aula34.labs;

import java.util.Scanner;

public class TesteConversaoDeUnidadesDeArea {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int opcao = -1;
		double num = 0;
		
		while(opcao != 0) {
		System.out.println("Qual operação deseja? ");
		System.out.println("1 - Converter Metro quadrado para pés quadrados");
		System.out.println("2 - Converter Pé quadrado para centímetros quadrados");
		System.out.println("3 - Converter Milha quadrada para Acres");
		System.out.println("4 - Converter Acre para pés quadrados");
		System.out.println("0 - Sair");
		opcao = scan.nextInt();
		
		System.out.println("Qual numero? ");
		num = scan.nextDouble();
		
		
		switch(opcao) {
		case 1: {
			System.out.println(num + " Metros quadrados equivalem a " + ConversaoDeUnidadesDeArea.converteMetroQuadradoParaPes(num) + " pés quadrados");
			break;
		}
		case 2: {
			System.out.println(num + " Pés quadrados equivalem a " + ConversaoDeUnidadesDeArea.convertePeQuadradoParaCentimetroQuadrado(num) + " centímetros quadrados");
			break;
		}
		case 3: {
			System.out.println(num + " Milhas quadradas equivalem a " + ConversaoDeUnidadesDeArea.converteMilhaQuadradaParaAcres(num) + " Acres");
			break;
		}
		case 4: {
			System.out.println(num + " Acres equivalem a " + ConversaoDeUnidadesDeArea.converteAcreParaPesQuadrados(num) + " pés quadrados");
			break;
		}
		}
		
		}

	}

}
