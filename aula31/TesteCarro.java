package aula31;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.marca = "Fiat";
		carro.consumoCombustivel = 0.3;
		
		int km = 10;
		
		System.out.println(carro.calcularCombustivel(km));
		

	}

}
