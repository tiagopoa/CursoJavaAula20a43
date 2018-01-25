package aula36.labs;

public class Agenda {

	private Contato[] contatos;
	private String nome;
	
	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String obterInfo() {
		String info = "Nome Agenda = " + nome + "\n";
		
		if(contatos != null) {
			for (Contato c: contatos) {
				info += c.obterInfo() + "\n";
			}
		}
		
		return info;
	}
	
}
