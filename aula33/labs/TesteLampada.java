package aula33.labs;

import java.util.Scanner;

public class TesteLampada {

	public static void main(String[] args) {

		int opcao = -1;
		
		Lampada lampada = new Lampada();
		
		Scanner scan = new Scanner(System.in);
		
		while (opcao != 4) {
		
		System.out.println("1 - Ligar lâmpada.");
		System.out.println("2 - Desligar lâmpada.");
		System.out.println("3 - Verifica estado da lâmpada.");
		System.out.println("4 - Sair.");
			opcao = scan.nextInt();
			
			if (opcao == 1) {
				System.out.println(lampada.ligar());
			} else if (opcao == 2) {
				System.out.println(lampada.desligar());
			} else if (opcao == 3) {
				System.out.println(lampada.isEstado());
			}

		}
	}



}
