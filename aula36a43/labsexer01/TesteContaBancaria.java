package aula36a43.labsexer01;

import java.util.Scanner;

public class TesteContaBancaria {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int opcao = -1;
		double valor;
		String nome;
		int numConta;
		double saldoInicial;
		ContaBancaria conta = new ContaBancaria();
		
		
		System.out.println("\nDigite o nome do cliente\n");
		nome = scan.nextLine();
		conta.setNomeCliente(nome);
		
		System.out.println("\nInforme o numero da conta\n");
		numConta = scan.nextInt();
		conta.setNumConta(numConta);
		
		System.out.println("\nInforme o saldo inicial\n");
		saldoInicial = scan.nextDouble();
		conta.setSaldo(saldoInicial);
		System.out.println("\nDep�sito realizado com sucesso.\nSaldo atual: " + conta.getSaldo() + "\n");
		
		ContaPoupanca contaP = new ContaPoupanca();
		
		System.out.println(conta);
		System.out.println(contaP);
		
		while (opcao != 0) {
			System.out.println("\n\nQual opera��o deseja?");
			System.out.println("1 - Saque");
			System.out.println("2 - Dep�sito");
			System.out.println("3 - Saldo");
			System.out.println("0 - Sair\n\n");
			opcao = scan.nextInt();
			
			switch(opcao) {
			case 1: {
				System.out.println("\nDigite o valor para saque");
				valor = scan.nextDouble();
				if (conta.sacar(valor)) {
					System.out.println("\nSaque efetuado com sucesso!\nSaldo Atual: " + conta.getSaldo() + "\n");
				} else {
					System.out.println("\nN�o foi poss�vel efetuar o saque.\nSaldo atual: " + conta.getSaldo());
				}
				break;
			}
			case 2: {
				System.out.println("\nQual valor para dep�sito?\n");
				valor = scan.nextDouble();
				conta.depositar(valor);
				break;
			}
			case 3:{
				System.out.println("\nSaldo: " + conta.getSaldo() + "\n");
				break;
			}
			}
			
			
		}
		
	}

}
