package aula35;

public class Calculadora {

	public static double somar(double num1, double num2) {
		return num1 + num2;
	}
	
	public static double subtrair(double num1, double num2) {
		return num1 - num2;
	}
	
	public static double multiplicar(double num1, double num2) {
		return num1 * num2;
	}
	
	public static double dividir(double num1, double num2) {
		return num1 / num2;
	}
	
	public static int calcularFatorialNaoRecursivo(int num1) {
		int fatorial = 1;
		
		for (int i = 1; i <= num1; i++) {
			fatorial = fatorial * i;
		}
		
		return fatorial;
	}
	
	
	public static int calcularFatorialRecursivo(int num) {
		
		if (num == 0) {
			return 1;
		}
		
		return num * calcularFatorialRecursivo(num - 1);
		
	}
	
}
