package aula25a27.Labs;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		ContaCorrente conta1 = new ContaCorrente();
				
		conta1.numero = 1234;
		conta1.saldo = 0;
		conta1.limite = 500;
		conta1.status = false;
		
		int opcao = -1;		
		
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
					conta1.realizarSaque(scan.nextInt());
					break;
				}
				case 2: {
					System.out.println("Qual valor deseja depositar?");					
					conta1.realizarDeposito(scan.nextDouble());
					break;
				}
				case 3: {
					System.out.println("Saldo " + conta1.consultarSaldo());
					break;
				}
				case 4: {
					conta1.verificarChequeEspecial();
					break;
				}
				case 0: {
					break;
				}
			}
			
			
		}
		

		
	}

}
