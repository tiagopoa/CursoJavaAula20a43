package aula35.labs;

public class Fibonacci {
	
	public static int calcularFibonacci(int num) {
		
		if (num == 1 || num == 2) {
			return 1;			
		} else {
			return calcularFibonacci(num -1) + calcularFibonacci(num-2);
		}		
		
	}

}
