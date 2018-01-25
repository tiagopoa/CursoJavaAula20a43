package aula25a27.Labs;

public class Aluno {
	
	String nome;
	int idade;
	String curso;
	int matricula;
	String[] disciplinas;
	double[] notas;
	
	String verificarAprovacao(double nota) {
		if (nota >= 7) {
		return "APROVADO";
		} else {
			return "REPROVADO";
		}
	}

}
