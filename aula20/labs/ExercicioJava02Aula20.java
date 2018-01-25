package aula20.labs;

import java.util.Random;

/*Gere e imprima uma matriz M 10x10 com valores aleatórios entre
0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
qual é o maior e o menor valor da coluna 7.*/

public class ExercicioJava02Aula20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] m = new int[10][10];
		int maiorLinha5 = Integer.MIN_VALUE;
		int menorLinha5 = Integer.MAX_VALUE;
		int maiorColuna7 = Integer.MIN_VALUE;
		int menorColuna7 = Integer.MAX_VALUE;
		
		Random gerador = new Random();
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = gerador.nextInt(9);
				
				if (i==4) {					
					if (m[i][j] > maiorLinha5) {
						maiorLinha5 = m[i][j];				
					}
					if (m[i][j] < menorLinha5) {				
						menorLinha5 = m[i][j];
					}					
				}
						
				if (j==6) {					
					if (m[i][j] > maiorColuna7) {
						maiorColuna7 = m[i][j];				
					}
					if (m[i][j] < menorColuna7) {				
						menorColuna7 = m[i][j];
					}													
				}
			}		
		}		
		
		for (int i = 0; i < m.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < m[i].length; j++) {				
				System.out.print(m[i][j]);
			}
		}
		
		System.out.println("\n ");
		
		System.out.println("O maior da Linha 5 é: " + maiorLinha5);
		System.out.println("O menor da Linha 5 é: " + menorLinha5);
		System.out.println("O maior da Coluna 7 é: " + maiorColuna7);
		System.out.println("O menor da Coluna 7 é: " + menorColuna7);
	}
}
