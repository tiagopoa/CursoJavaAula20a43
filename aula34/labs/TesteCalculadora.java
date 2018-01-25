package aula34.labs;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Somar: " + Calculadora.somar(1, 2));
		
		System.out.println("Subtrair: " + Calculadora.subtrair(2, 1));
		
		System.out.println("Multiplicar: " + Calculadora.multiplicar(1, 100));
		
		System.out.println("Dividir: " + Calculadora.dividir(10, 2));
		
		System.out.println();
		
		System.out.println("Digite um numero para calcular o fatorial: ");
		Scanner scan = new Scanner(System.in);
		
		System.out.println(Calculadora.calcularFatorial(scan.nextInt()));

	}

}
