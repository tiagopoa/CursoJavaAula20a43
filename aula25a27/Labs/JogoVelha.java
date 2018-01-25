package aula25a27.Labs;

public class JogoVelha {

	char[][] m;
	int jogada;
	
	public JogoVelha() {
		m = new char[3][3];
		jogada = 1;
	}
	
	int verificaJogada() {
		return jogada;		
	}

	boolean validarJogada(int linha, int coluna, char sinal) {
		if (m[linha][coluna] == 'X' || m[linha][coluna] == 'O') {
			return false;
		} else {
			m[linha][coluna] = sinal;
			jogada++;
			return true;
		}
	}
	
	void imprimirTabuleiro() {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "|");
			}
			System.out.println();
		}
	}
	
	boolean verificaSeGanhador(char sinal) {
		if (m[0][0] == sinal && m[0][1] == sinal && m[0][2] == sinal || 
				m[1][0] == sinal && m[1][1] == sinal && m[1][2] == sinal || 
				m[2][0] == sinal && m[2][1] == sinal && m[2][2] == sinal || 
				m[0][0] == sinal && m[1][0] == sinal && m[2][0] == sinal || 
				m[0][1] == sinal && m[1][1] == sinal && m[2][1] == sinal || 
				m[0][2] == sinal && m[1][2] == sinal && m[2][2] == sinal || 
				m[0][0] == sinal && m[1][1] == sinal && m[2][2] == sinal || 
				m[2][2] == sinal && m[1][1] == sinal && m[0][2] == sinal ) {	
				return true;
			} 
				return false;			
	}
	
	void validarLinha(int linha) {
		boolean linhaValida = false;
		while (!linhaValida) {
			System.out.println("Entre com a linha (1, 2 ou 3)");			
			if (linha >= 1 && linha <= 3) {
				linhaValida = true;
			} else {
				System.out.println("Entrada inválida, tente novamente.");
			}
		}
	}
	
	void validarColuna() {
		
	}
	
}
