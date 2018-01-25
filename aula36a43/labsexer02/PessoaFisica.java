package aula36a43.labsexer02;

public class PessoaFisica extends Contribuinte{

	private int imposto;
	private String cpf;
	

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getImposto() {
		return imposto;
	}

	public void setImposto(int imposto) {
		this.imposto = imposto;
	}


	@Override
	public double calcularImposto() {
		if (getRendaBruta() >=0 && getRendaBruta() <= 1400) {
			return 0;
		} else if (getRendaBruta() > 1400 && getRendaBruta() <= 2100) {
			return (this.getRendaBruta() * 0.1) - 100;
		} else if (getRendaBruta() > 2100 && getRendaBruta() <= 2800) {
			return (this.getRendaBruta() * 0.15) - 270;
		} else if (getRendaBruta() > 2800 && getRendaBruta() <= 3600) {
			return (this.getRendaBruta() * 0.25) - 500;
		} 
			return (this.getRendaBruta() * 0.3) - 700;
		
	}
	
	@Override
	public String toString() {
		String s = "Pessoa Física[";
		s += super.toString();
		s += " ;cpf: " + cpf;
		s += " ;imposto a ser pago: " + calcularImposto();
		return s;
	}
	
	
}
