package aula34.labs;

import java.util.Scanner;

public class TesteConversaoDeUnidadesDeVolume {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int opcao = -1;
		double num = 0;
		
		while (opcao != 0) {
			
			System.out.println("Qual operação deseja?");
			System.out.println("1 - Converter de Litro para Centimetro cúbico");
			System.out.println("2 - Converter Metro cúbico para Litro");
			System.out.println("3 - Converter Metro cúbico para pés cúbicos");
			System.out.println("4 - Converter Galão Americano para polegadas cúbicas");
			System.out.println("5 - Converter Galão Americano para litro");
			System.out.println("0 - Sair");
			opcao = scan.nextInt();
			
			System.out.println("Qual o numero?");
			num = scan.nextDouble();
			
			switch(opcao) {
			case 1: {
				System.out.println(num + " Litro equivale a " + ConversaoDeUnidadesDeVolume.converterLitroParaCentimetroCubico(num) + " Centimetro cubico");
				break;
			}
			case 2: {
				System.out.println(num + " Metro cúbico equivale a " + ConversaoDeUnidadesDeVolume.converterMetroCubicoParaLitro(num) + " Litros");
				break;
			}
			case 3: {
				System.out.println(num + " Metro cúbico equivale a " + ConversaoDeUnidadesDeVolume.converterMetroCubicoParaPeCubico(num) + " Pés cúbicos");
				break;
			}
			case 4: {
				System.out.println(num + " Galão Americano equivale a " + ConversaoDeUnidadesDeVolume.converterGalaoAmericanoParaPolegadasCubicas(num) + " polegadas cubicas");
				break;
			}
			case 5: {
				System.out.println(num + " Galão Americano equivale a " + ConversaoDeUnidadesDeVolume.converterGalaoAmericanoParaLitro(num) + " Litro");
				break;
			}
			}
			
			
		}

	}

}
