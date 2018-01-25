package aula20.labs;

import java.util.Random;
import java.util.Scanner;

public class ExercicioJava04Aula20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Fa�a um programa para armazenar em uma matriz os compromissos de uma agenda pessoal. 
		 * Cada dia do m�s deve conter 24 horas, onde para cada uma destas 24 horas podemos associar 
		 * um tarefa espec�fica (compromisso agendado). O programa deve ter um menu onde o usu�rio indica 
		 * o dia do m�s que deseja alterar e a hora, entrando em seguida com o compromisso, ou ent�o, o 
		 * usu�rio pode tamb�m consultar a agenda, fornecendo o dia e a hora para obter o compromisso armazenado*/		
		
		String m[][] = new String[30][24];
		
		Random gerador = new Random();
		Scanner scan = new Scanner(System.in);

		int opcao = 0;
		
		while (opcao != 3) {
		
			int dia = 0;
			int hora = -1;
			String compromisso = null;			
			
		System.out.println("\n\nO que deseja fazer?");
		System.out.println("1 - Inserir compromisso?");
		System.out.println("2 - Consultar compromisso?");
		System.out.println("3 - Sair.");
		opcao = scan.nextInt();
		
		
		if (opcao == 1) {
		
		System.out.println("\nInforme o dia do m�s da agenda: (1 at� 30)");
			while (dia <= 0) {
			dia = scan.nextInt();
			}
		System.out.println("\nInforme a hora que deseja inserir/alterar: (0 at� 23)");			
		while (hora <= -1) {
			hora = scan.nextInt();
			}
		System.out.println("Qual o compromisso?\n");
			compromisso = scan.next();
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (i == dia && j == hora) {
				m[i][j] = compromisso;
				}
			}
		}
		} else if (opcao == 2) {
			
			System.out.println("\nQual dia deseja consultar? ");
			dia = scan.nextInt();
			System.out.println("\nQual hor�rio? ");
			hora = scan.nextInt();

			if (m[dia][hora] == null) {
				System.out.println("\n\nHor�rio LIVRE ! ! !");
			} else {
			System.out.println("\nDia: " + dia + " �s " + hora);
			System.out.println(m[dia][hora]);
			}

		
		}
			
		}
		
	}
	}


