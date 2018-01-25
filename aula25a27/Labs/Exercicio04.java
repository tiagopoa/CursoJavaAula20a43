package aula25a27.Labs;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JogoVelha jogo = new JogoVelha();

		Scanner scan  = new Scanner(System.in);
		boolean ganhou=false;
		char sinal;
		int linha;
		int coluna;
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		while (!ganhou) {
			
			if (jogo.verificaJogada() % 2 == 1) {
				System.out.println("Vez Jogador 1: Escolha a linha e coluna (1-3): ");
				sinal = 'X';		
			} else {
				System.out.println("Vez Jogador 2: Escolha a linha e coluna (1-3) ");
				sinal = 'O';
			}
				
				linha = valor("Linha", scan);
				coluna = valor("Coluna", scan);
				
				if (!jogo.validarJogada(linha, coluna, sinal)) {
					System.out.println("Jogada inválida, tente novamente.");
				}
				
				jogo.imprimirTabuleiro();
				
				if (jogo.verificaSeGanhador('X')) {
					System.out.println("X ganhou!!!");
					ganhou = true;
				} else if (jogo.verificaSeGanhador('O')) {
					System.out.println("O ganhou!!!");
					ganhou = true;
				} else if(jogo.verificaJogada()>9) {
					ganhou = true;
					System.out.println("Empatou!");
				}	
				
		}	
		
	}

	
	static int valor(String tipoValor, Scanner scan) {
		int valor = 0;
		boolean valorValida = false;
		while (!valorValida) {
			System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3");
			valor = scan.nextInt();
			if (valor >= 1 && valor <= 3) {
				valorValida = true;
			} else {
				System.out.println("Entrada inválida, tente novamente");
			}
		}
		valor--;
		return valor;
	}
	
}
