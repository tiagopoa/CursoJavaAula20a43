package aula33.labs;

public class ContaCorrente {

	private int numero;
	private double saldo;
	private Boolean status;
	private double limite;
	
	public ContaCorrente() {	}

	public ContaCorrente(int numero, double saldo, Boolean status, double limite) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.status = status;
		this.limite = limite = 500;
	}

	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void realizarSaque(int valor) {
		if (consultarSaldo()<valor) {
			System.out.println("Saldo insuficiente.");
		} else {
		this.saldo -= valor;
		}
	}

	public void realizarDeposito(double valor) {
		this.saldo += valor;
		
	}

	public double consultarSaldo() {
		return this.saldo;
	}

	public void verificarChequeEspecial() {
		
	}

	
	
	
	
	
}
