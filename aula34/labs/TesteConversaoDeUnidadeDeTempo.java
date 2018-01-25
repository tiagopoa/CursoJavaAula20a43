package aula34.labs;

import java.util.Scanner;

public class TesteConversaoDeUnidadeDeTempo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int opcao = -1;
		double num = 0;
		
		while (opcao != 0) {
			
			System.out.println("Qual operação deseja? ");
			System.out.println("1 - Converter de Minuto para segundo");
			System.out.println("2 - Converter de hora para minuto");
			System.out.println("3 - Converter de dia para hora");
			System.out.println("4 - Converter de semana para dia");
			System.out.println("5 - Converter de mes para dia");
			System.out.println("6 - Converter de ano para dia");
			System.out.println("0 - Sair");
			opcao = scan.nextInt();
			
			System.out.println("Qual numero");
			num = scan.nextDouble();
			
			switch(opcao) {
			case 1: {
				System.out.println(num + "Minutos equivalem a " + ConversaoDeUnidadeDeTempo.converterDeMinutoParaSegundo(num) + " segundos");
				break;
			}
			case 2: {
				System.out.println(num + "Horas equivalem a " + ConversaoDeUnidadeDeTempo.converterDeHoraParaMinuto(num) + " minutos");
				break;
			}
			case 3: {
				System.out.println(num + "Dias equivalem a " + ConversaoDeUnidadeDeTempo.converterDeDiaParaHora(num) + " horas");
				break;
			}
			case 4: {
				System.out.println(num + "Semanas equivalem a " + ConversaoDeUnidadeDeTempo.converterDeSemanaParaDia(num) + " dias");
				break;
			}
			case 5: {
				System.out.println(num + "Mes equivalem a " + ConversaoDeUnidadeDeTempo.converterDeMesParaDia(num) + " dias");
				break;
			}
			case 6: {
				System.out.println(num + "Ano equivalem a " + ConversaoDeUnidadeDeTempo.converterDeAnoParaDia(num) + " dis");
				break;
			}

			}
			
		}

	}

}
