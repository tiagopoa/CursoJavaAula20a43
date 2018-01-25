package aula33.labs;

public class Aluno {

	private String nome;
	private int idade;
	private String curso;
	private int matricula;
	private String[] disciplinas;
	private double[][] notasDisciplinas;	
	
	public Aluno() {
		this.disciplinas = new String[3];
		this.notasDisciplinas = new double[3][4];	
	}

	public Aluno(String nome, int idade, String curso, int matricula, String[] disciplinas,
			double[][] notasDisciplinas) {
		this.nome = nome;
		this.idade = idade;
		this.curso = curso;
		this.matricula = matricula;
		this.disciplinas = disciplinas;
		this.notasDisciplinas = notasDisciplinas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}


	public double[][] getNotasDisciplinas() {
		return notasDisciplinas;
	}

	public void setNotasDisciplinas(double[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}






	
	
	
}
