package aula33.labs;

import java.util.Scanner;

public class TesteContaCorrente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao = -1;
		
		Scanner scan = new Scanner(System.in);
		ContaCorrente conta = new ContaCorrente();
		
		while (opcao != 0) {
			System.out.println("Qual operação deseja realizar?");
			System.out.println("1 - Saque");
			System.out.println("2 - Depósito");
			System.out.println("3 - Consultar Saldo");
			System.out.println("4 - Verificar ChequeEspecial");
			System.out.println("0 - Sair");
			opcao = scan.nextInt();
			
			switch (opcao) {
				case 1: {
					System.out.println("Qual valor deseja sacar?");					
					conta.realizarSaque(scan.nextInt());					
					break;			
				}
				case 2: {
					System.out.println("Qual valor deseja depositar?");					
					conta.realizarDeposito(scan.nextDouble());
					break;
				}
				case 3: {
					System.out.println("Saldo " + conta.consultarSaldo());
					break;
				}
				case 4: {
					conta.verificarChequeEspecial();
					break;
				}
				case 0: {
					break;
				}
			}
			
			

	}
		}
	}


