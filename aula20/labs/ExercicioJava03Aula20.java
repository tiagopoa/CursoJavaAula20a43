package aula20.labs;

import java.util.Random;


public class ExercicioJava03Aula20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] m = new int [3][3];
		int par = 0;
		int impar = 0;		
	
		Random gerador = new Random();

		for (int i = 0; i < m.length; i++) {
			System.out.println(" ");
			for (int j = 0 ; j < m[i].length; j++) {
				m[i][j] = gerador.nextInt();
				
				System.out.print(m[i][j] + " ");
				
				if (m[i][j] % 2 == 0) {
					par++;
				} else if (m[i][j] % 2 != 0) {
					impar++;
				}
				
			}
		}
		
		System.out.println("\n\nPares: " + par);
		System.out.println("Ímpares: " + impar);
		
	}

}
