package aula20;

import java.util.Scanner;

public class ArraysIrregulares {
	
	/*Escreva um programa para guardar dados de uma pesquisa feita com uma amostra de pessoas da avenida mais movimentada 
	 * da cidade onde você mora.
	 * A pesquisa consiste em perguntar ao cidadão a quantidade de filhos e o nome de cada filho.
	 * Guarde essas informações em uma matriz de forma que cada pessoa entrevistada ocupe somente 
	 * o espaço necessário na memória para guardar os nomes dos filhos.
	 * Imprima a quantidade de pessoas entrevistadas, a quantidade de filhos de cada entrevistado 
	 * e os respectivos nomes dos filhos.
	 * */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int qtdFilhos = 0;		
		int numEntrevistados = 0;
		String nomeFilho = null;
		System.out.println("Quantas pessoas serão entrevistadas?");
		numEntrevistados = scan.nextInt();
		
		String[][] nomesFilhos = new String[numEntrevistados][];

		
		//arrayIrregular[0] = new int[1];
		//arrayIrregular[1] = new int[2];
		//arrayIrregular[2] = new int[3];
		
		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("\nEntrevista " + (i+1));
			System.out.println("Quantos filhos você tem? ");
			qtdFilhos = scan.nextInt();
			nomesFilhos[i] = new String [qtdFilhos];
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println("\nQual nome do filho " + (j+1) + "? ");
				nomeFilho = scan.next();
				nomesFilhos[i][j] = nomeFilho;
			}
		}
		
		for (int i = 0; i < nomesFilhos.length; i++) {
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println("\nEntrevistado " + (i+1) + ": ");
				System.out.println("Nome do Filho " + (j+1) + ": " + nomesFilhos[i][j]);
			}
		}

	}

}
