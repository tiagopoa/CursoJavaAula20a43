package aula24.Labs;

public class Conta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaCorrente conta = new ContaCorrente();
		conta.limite = 10500;
		conta.numero = 123456;
		conta.saldo = 500.45;
		conta.status = false;
		
		System.out.println(conta.numero);
		System.out.println(conta.limite);
		System.out.println(conta.saldo);
		System.out.println(conta.status);
		

	}

}
