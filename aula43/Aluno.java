package aula43;

import java.util.Arrays;

public class Aluno {

	private String curso;
	private double[] notas;

	public void verificarAcesso() {
	
	}
	
	
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Aluno(String nome, String endereco, String telefone, String curso) {
		
		this.curso = curso;
	}



	

	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (!Arrays.equals(notas, other.notas))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}


	public double[] getNotas() {
		return notas;
	}


	public void setNotas(double[] notas) {
		this.notas = notas;
	}


	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return false;
	}
	
	
	
}
