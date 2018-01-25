package aula33.labs;

public class Lampada {
	
	private int potencia;
	private int consumo;
	private String corDaLuz;
	private double preco;
	private int tensao;
	private boolean estado;
	
	public Lampada() {}

	public Lampada(int potencia, int consumo, String corDaLuz, double preco, int tensao) {
		super();
		this.potencia = potencia;
		this.consumo = consumo;
		this.corDaLuz = corDaLuz;
		this.preco = preco;
		this.tensao = tensao;
	}

	
	
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public String getCorDaLuz() {
		return corDaLuz;
	}

	public void setCorDaLuz(String corDaLuz) {
		this.corDaLuz = corDaLuz;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getTensao() {
		return tensao;
	}

	public void setTensao(int tensao) {
		this.tensao = tensao;
	}
	
	public boolean ligar() {
		this.estado = true;
		return true;
	}
	
	public boolean desligar() {
		this.estado =  false;
		return false;
	}
	

	

}
