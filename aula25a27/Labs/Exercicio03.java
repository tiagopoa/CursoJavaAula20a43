package aula25a27.Labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno = new Aluno();
		Scanner scan = new Scanner(System.in);
		
		aluno.nome = "Tiago";
		aluno.idade = 36;
		aluno.matricula = 1234;
		aluno.curso = "Analise e desenvolvimento de sistemas";
		
		aluno.disciplinas = new String[3];
		aluno.notas = new double[3];
		
		for (int i = 0; i < aluno.notas.length; i++) {
			System.out.println("Digite o nome da disciplina " + (i+1) + ": ");
			aluno.disciplinas[i] = scan.next();
		System.out.println("Digite a nota da disciplina " + aluno.disciplinas[i]);
			aluno.notas[i] = scan.nextDouble();
		}			
			
		System.out.println(aluno.curso);
		for (int i = 0; i < 3; i++) {
			System.out.println("Disciplina: " + aluno.disciplinas[i] + " Nota: " + aluno.notas[i] + " Resultado: " +aluno.verificarAprovacao(aluno.notas[i]));
		}			
	}
}
