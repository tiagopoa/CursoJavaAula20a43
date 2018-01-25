package aula31;

class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " + this.capCombustivel * this.consumoCombustivel + " km");
	}
	
	public double obterAutonomia() {
		System.out.println("M�todo obter autonomia foi chamado.");
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	private double divideKmPorConsumoCombustivel(double km) {
		return km / this.consumoCombustivel;
	}
	
	public double calcularCombustivel(double km) {
		return this.divideKmPorConsumoCombustivel(km);
	}
}
