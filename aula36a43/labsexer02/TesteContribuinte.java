package aula36a43.labsexer02;

import java.util.Scanner;

public class TesteContribuinte {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
			
				PessoaFisica pf1 = new PessoaFisica();
				pf1.setNome("Contribuinte 01");
				pf1.setRendaBruta(1000);
				pf1.setCpf("583.358.456-62");
				
				PessoaJuridica pj1 = new PessoaJuridica();
				pj1.setNome("Contribuinte 02");
				pj1.setRendaBruta(5000);
				pj1.setCnpj("583.358.456-62");
				
				PessoaFisica pf2 = new PessoaFisica();
				pf2.setNome("Contribuinte 03");
				pf2.setRendaBruta(6000);
				pf2.setCpf("583.358.456-62");
				
				PessoaJuridica pj2 = new PessoaJuridica();
				pj2.setNome("Contribuinte 04");
				pj2.setRendaBruta(4000);
				pj2.setCnpj("583.358.456-62");
				
				PessoaFisica pf3 = new PessoaFisica();
				pf3.setNome("Contribuinte 05");
				pf3.setRendaBruta(3000);
				pf3.setCpf("583.358.456-62");
				
				PessoaJuridica pj3 = new PessoaJuridica();
				pj3.setNome("Contribuinte 06");
				pj3.setRendaBruta(2000);
				pj3.setCnpj("583.358.456-62");
				
				Contribuinte[] contribuintes = new Contribuinte[6];
				contribuintes[0] = pf1;
				contribuintes[1] = pj1;
				contribuintes[2] = pf2;
				contribuintes[3] = pj2;
				contribuintes[4] = pf3;
				contribuintes[5] = pj3;
				
			
		for (Contribuinte c : contribuintes) {
			System.out.println(c.toString());
		}
		

	}

}
