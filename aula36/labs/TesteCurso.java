package aula36.labs;

import java.util.Scanner;

public class TesteCurso {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		Curso curso = new Curso();
		
		Professor professor = new Professor();
		
		
		
		System.out.println("Entre com o nome do Curso");
		curso.setNome(scan.nextLine());
		
		System.out.println("Entre com o horario do curso");
		curso.setHorario(scan.nextLine());
		
		System.out.println("Qual nome do professor? ");
		professor.setNome(scan.nextLine());
		
		System.out.println("Qual departamento do professor?");
		professor.setDepartamento("TI");
		
		System.out.println("Qual email do professor");
		professor.setEmail("professor@email.com");
		
		curso.setProfessor(professor);
		
		Aluno[] alunos = new Aluno[5];
		for (int i = 0; i < alunos.length; i++) {
			
			Aluno aluno = new Aluno();			
			
			System.out.println("Nome do aluno " + (i+1));
			aluno.setNome(scan.nextLine());
			
			System.out.println("Matricula do aluno " + (i+1));
			aluno.setMatricula(scan.nextLine());
			
			double[] notas = new double[4];
			
			for (int k = 0; k < notas.length; k++) {
			System.out.println("Nota " + (k+1) + " do aluno " + (i+1));
			notas[k]= scan.nextDouble();
			}
			
			aluno.setNotas(notas);
			alunos[i] = aluno;
			
		}
		
		curso.setAlunos(alunos);
		
		System.out.println(curso.obterInfo());

	}

}
