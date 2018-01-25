package aula25a27.Labs;

public class ContaCorrente {

	int numero;
	double saldo;
	Boolean status;
	double limite;
	
	void realizarSaque(int valor) {		
		if (consultarSaldo() - valor < (limite*-1)) {
			System.out.println("Saldo insuficiente");
		} else {
		saldo -= valor;
		}
		consultarSaldo();
	}
	
	void realizarDeposito(double valor) {
		saldo += valor;
		consultarSaldo();
	}
	
	double consultarSaldo(){
		return saldo;
	}
	
	void verificarChequeEspecial(){
		if (consultarSaldo() < 0) {
		System.out.println("Está usando ChequeEspecial");	
		} else {
			System.out.println("Não está usando ChequeEspecial");
		}
	}
	
}
