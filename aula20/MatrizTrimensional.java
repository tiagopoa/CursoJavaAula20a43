package aula20;

public class MatrizTrimensional {
	
	/*Faça um programa que crie uma matriz 3x3x3 onde cada elemento da matriz seja igual a soma dos seus indices 
	 * (exemplo: M[1,2,1] = 1 + 2 + 1 = 4).
	 *Obtenha a soma de todos os elementos da matriz, e obtenha soma dos elementos cujos valores são pares e 
	 *a soma dos elementos cujos valores são ímpares.
	 *Exibir na tela os valores da soma atual, soma dos pares e soma dos ímpares. */

	public static void main(String[] args) {

		//int MAX = 3;
		int[][][] matrizTridimensional = new int[3][3][3];

		for (int i = 0; i < matrizTridimensional.length; i++ ) {
			for (int j = 0; j < matrizTridimensional[i].length; j++) {
				for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
					matrizTridimensional[i][j][k] = i + j + k;
				}
			}
		}
		
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		for (int i = 0; i < matrizTridimensional.length; i++ ) {
			for (int j = 0; j < matrizTridimensional[i].length; j++) {
				for (int k = 0; k < matrizTridimensional[i][j].length; k++) {

					soma += matrizTridimensional[i][j][k];
					
					if (matrizTridimensional[i][j][k] % 2 == 0) {
						somaPares += matrizTridimensional[i][j][k];
					} else if (matrizTridimensional[i][j][k] % 2 != 0) {
						somaImpares += matrizTridimensional[i][j][k];
					}
					
				}
			}
		}
		
		System.out.println("Soma total: " + soma);
		System.out.println("Soma dos pares: " + somaPares);
		System.out.println("Soma dos impares: " + somaImpares);
		
	}

}
