package aula24.Labs;


public class LivroDeLivraria {
	
	public static void main(String[] args) {

	Livro livro = new Livro();
	livro.altura = 12.2;
	livro.autor = "Autor Teste";
	livro.capaDura = true;
	
	
	System.out.println(livro.altura);
	System.out.println(livro.autor);
	System.out.println(livro.capaDura);
}
}
