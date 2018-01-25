package aula36;

public class TesteContato {

	public static void main(String[] args) {

		Contato contato = new Contato();
		
		contato.setNome("Tyrion");
		//contato.setEndereco("Kings Landing");
		//contato.setTelefone("11 99999-9999");
		
		//criar objet Telefone
		Telefone tel = new Telefone();
		tel.setDdd("51");
		tel.setTipo("Celular");
		tel.setNumero("995148560");
		
		Telefone tel2 = new Telefone();
		tel2.setDdd("51");
		tel2.setTipo("fixo");
		tel2.setNumero("32323232");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;
		
		//contato.setTelefone(tel);
		contato.setTelefones(telefones);
		
		
		//criar objeto endereco		
		Endereco end = new Endereco();
		end.setNomeRua("Nova Petropolis");
		end.setCep("92990000");
		end.setComplemento("casa");
		end.setEstado("RS");
		end.setCidade("Eldroado do Sul");
		end.setNumero("919");
		
		contato.setEndereco(end);
		
		System.out.println(contato.getNome());		
		
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		
		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}

	}

}
