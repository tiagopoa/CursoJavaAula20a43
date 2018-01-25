package aula36.labs;

import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Olá\nDigite o nome da agenda");
		
		Agenda agenda = new Agenda();
		agenda.setNome(scan.nextLine());
		
		
		
		Contato[] contatos = new Contato[3];
		
		
		for (int i = 0; i < contatos.length; i++) {
			
			Contato contato = new Contato();
			
			System.out.println("Nome: ");  
			contato.setNome(scan.nextLine());
						
			System.out.println("Telefone: ");  
			contato.setTelefone(scan.nextLine());
			
			System.out.println("Email: ");  
			contato.setEmail(scan.nextLine());
			
			contatos[i] = contato;
			
		}
		
		
		agenda.setContatos(contatos);		
		
		
		//For comum e For melhorado para listar os contatos
		if (agenda != null && agenda.getContatos() != null) {
			
			for (int i = 0; i < agenda.getContatos().length;i++) {
				System.out.println(agenda.getContatos()[i].getNome());
			}
			
			for (Contato a: agenda.getContatos() ) {
				System.out.println(a.getNome());
			}
		}
		
		if(agenda != null) {
		System.out.println(agenda.obterInfo());
		}

	}

}
