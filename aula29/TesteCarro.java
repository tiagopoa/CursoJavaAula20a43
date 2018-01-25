package aula29;


public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		//van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.numPassageiros);
		
		Carro van2 = new Carro("Fiat", "Ducato");
		//van2.modelo = "Ducato";
		
		System.out.println(van2.marca + " " + van2.modelo);
		
		Carro2 carro2 = new Carro2();

	}

}
