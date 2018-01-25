package aula35.labs;

import java.util.Scanner;

public class TesteFibonacci {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Calcular o Fibonacci");
		System.out.println("Qual n-esimo termo que deseja descobrir?");
		System.out.println("Resultado Fibonacci: " + Fibonacci.calcularFibonacci(scan.nextInt()));
		
		

	}

}
