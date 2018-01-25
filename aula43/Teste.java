package aula43;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno1 = new Aluno();		
		aluno1.setCurso("Ciencia da computação");
		double[] notas = {10,9,8,7};
		aluno1.setNotas(notas);
		
		System.out.println(aluno1);
		
		String s1 = "sdsdsdf";
		String s2 = "sdsdsdf";
		
		Aluno aluno2 = new Aluno();		
		aluno2.setCurso("Ciencia da computação");
		double[] notas2 = {10,9,8,7};
		aluno2.setNotas(notas2);
		
		
		System.out.println(s1 == s2);
		
		System.out.println(aluno1.equals(aluno2));

	}



}
