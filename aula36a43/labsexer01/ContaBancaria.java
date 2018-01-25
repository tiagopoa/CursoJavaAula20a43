package aula36a43.labsexer01;

public class ContaBancaria {
	
	private String nomeCliente;
	private int numConta;
	private double saldo;
	
	
	
	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}	
	public boolean sacar(double valor) {
		if (saldo >= valor) {
		saldo -= valor;
		return true;
		} else {
			return false;			
		}		
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}

}
