package aula20.labs;

import java.util.Scanner;

public class ExercicioJava06Aula20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		char[][] m = new char[3][3];
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou=false;
		int jogada = 1;
		char sinal;
		int linha = 0;
		int coluna = 0;

		

		
		while (!ganhou) {
		
	if (jogada % 2 == 1) {
		System.out.println("Vez Jogador 1: Escolha a linha e coluna (1-3): ");
		sinal = 'X';		
	} else {
		System.out.println("Vez Jogador 2: Escolha a linha e coluna (1-3) ");
		sinal = 'O';
	}
	
	boolean linhaValida = false;
	while (!linhaValida) {
		System.out.println("Entre com a linha (1, 2 ou 3)");
		linha = scan.nextInt();
		if (linha >= 1 && linha <= 3) {
			linhaValida = true;
		} else {
			System.out.println("Entrada inválida, tente novamente.");
		}
	}
	
	boolean colunaValida = false;
	while (!colunaValida) {
		System.out.println("Entre com a coluna (1, 2 ou 3)");
		coluna = scan.nextInt();
		if (coluna >= 1 && coluna <= 3) {
			colunaValida = true;
		} else {
			System.out.println("Entrada inválida, tente novamente.");
		}
	}
	
	
		linha--; 
		coluna--;
		if (m[linha][coluna] == 'X' || m[linha][coluna] == 'O') {
			System.out.println("Posição ocupada. Tente outra.");
		} else {
			m[linha][coluna] = sinal;
			jogada++;
		}
		
		//imprimir tabuleiro
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "|");
			}
			System.out.println();
		}
		
		//verifica se tem ganhador
		if (m[0][0] == 'X' && m[0][1] == 'X' && m[0][2] == 'X' || 
			m[1][0] == 'X' && m[1][1] == 'X' && m[1][2] == 'X' || 
			m[2][0] == 'X' && m[2][1] == 'X' && m[2][2] == 'X' || 
			m[0][0] == 'X' && m[1][0] == 'X' && m[2][0] == 'X' || 
			m[0][1] == 'X' && m[1][1] == 'X' && m[2][1] == 'X' || 
			m[0][2] == 'X' && m[1][2] == 'X' && m[2][2] == 'X' || 
			m[0][0] == 'X' && m[1][1] == 'X' && m[2][2] == 'X' || 
			m[2][2] == 'X' && m[1][1] == 'X' && m[0][2] == 'X' ) {			
			System.out.println("X ganhou!!!");
			ganhou = true;
		} else if (m[0][0] == 'O' && m[0][1] == 'O' && m[0][2] == 'O' || 
				   m[1][0] == 'O' && m[1][1] == 'O' && m[1][2] == 'O' || 
				   m[2][0] == 'O' && m[2][1] == 'O' && m[2][2] == 'O' || 
				   m[0][0] == 'O' && m[1][0] == 'O' && m[2][0] == 'O' || 
				   m[0][1] == 'O' && m[1][1] == 'O' && m[2][1] == 'O' || 
				   m[0][2] == 'O' && m[1][2] == 'O' && m[2][2] == 'O' || 
				   m[0][0] == 'O' && m[1][1] == 'O' && m[2][2] == 'O' || 
				   m[2][0] == 'O' && m[1][1] == 'O' && m[0][2] == 'O' ) {
			System.out.println("O ganhou!!!");
			ganhou = true;
		}
	
		if(jogada>9) {
			System.out.println("Empatou!");
			break;
		}	
		}			
	}

}
