package aula35;

public class TesteCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fatorialNR = Calculadora.calcularFatorialNaoRecursivo(5);
		System.out.println(fatorialNR);
		
		int fatorialR = Calculadora.calcularFatorialRecursivo(5);
		System.out.println(fatorialR);

	}

}
