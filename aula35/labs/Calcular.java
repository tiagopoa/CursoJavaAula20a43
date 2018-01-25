package aula35.labs;

public class Calcular {

	public static int calcular(int num) {
		
		if (num == 1) {
			return 1;
		}

		return num + calcular(num-1);
		
	}
	
}


