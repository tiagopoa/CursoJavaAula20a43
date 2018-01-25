package aula20;

import java.util.Random;

public class Matrizes {
	
	//Faça um programa que armazene 4 notas para 30 alunos e depois exiba elas.

	public static void main(String[] args) {

		double[][] notasAlunos = new double[30][4];
		
		double start = 4;
		double end = 10;	
		
		for (int i = 0; i < notasAlunos.length; i++) {
			for (int k = 0; k < notasAlunos[k].length; k++) {
				double random = new Random().nextDouble();
				double result = start + (random * (end - start));
				notasAlunos[i][k] = result;
			}
		}

		for (int i = 0; i < notasAlunos.length; i++) {
			System.out.print("\n\nAluno " + (i+1) + ": ");
			for (int k = 0; k < notasAlunos[k].length; k++) {
				System.out.print(notasAlunos[i][k] + "	");
			}
		}
		
		
	}

}
