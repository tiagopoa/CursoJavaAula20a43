package aula33.labs;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		
		System.out.println("Nome: ");
		aluno.setNome(scan.next());
		System.out.println("Matricula: ");
		aluno.setMatricula(scan.nextInt());
		System.out.println("Idade: ");
		aluno.setIdade(scan.nextInt());
		System.out.println("Curso: ");
		aluno.setCurso(scan.nextLine());
		
		System.out.println();
		System.out.println("Qual disciplina? ");

	}

}
