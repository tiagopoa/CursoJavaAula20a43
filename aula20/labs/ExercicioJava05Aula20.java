package aula20.labs;

import java.util.Random;
import java.util.Scanner;

public class ExercicioJava05Aula20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Modifique o programa anterior de maneira a guardar os compromissos de todo o ano, organizados por mês, 
		  dia e hora (só 8 horas por dia).*/
		
String m[][][] = new String[12][30][24];
		
		Random gerador = new Random();
		Scanner scan = new Scanner(System.in);

		int opcao = 0;
		
		while (opcao != 3) {
		
			int mes = 0;
			int dia = 0;
			int hora = -1;
			String compromisso = null;			
			
		System.out.println("\n\nO que deseja fazer?");
		System.out.println("1 - Inserir compromisso?");
		System.out.println("2 - Consultar compromisso?");
		System.out.println("3 - Sair.");
		opcao = scan.nextInt();
		
		
		if (opcao == 1) {
		
		System.out.println("\nInforme o mês desejado: (1 até 12)");
			while (mes <= 0) {
				mes = scan.nextInt();
			}
		System.out.println("\nInforme o dia do mês da agenda: (1 até 30)");
			while (dia <= 0) {
				dia = scan.nextInt();
			}
		System.out.println("\nInforme a hora que deseja inserir/alterar: (9 até 17)");			
			while (hora <= -1) {
				hora = scan.nextInt();
			}
		System.out.println("Qual o compromisso?\n");
			compromisso = scan.next();
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				for (int k = hora; k < m[i][j].length; k++) {
					if (i == mes && j == dia && k == hora) {
						m[i][j][k] = compromisso;
					}
				}
			}
		}
		
		} else if (opcao == 2) {
			
			System.out.println("\nQual mês deseja consultar? ");
			mes = scan.nextInt();
			System.out.println("\nQual dia deseja consultar? ");
			dia = scan.nextInt();
			System.out.println("\nQual horário? ");
			hora = scan.nextInt();

			if (m[mes][dia][hora] == null) {
				System.out.println("\n\nHorário LIVRE ! ! !");
			} else {
			System.out.println("\nMês: " + mes + " Dia: " + dia + " às " + hora);
			System.out.println(m[mes][dia][hora]);
			}

		
		}
			
		}
		
	}

	}


