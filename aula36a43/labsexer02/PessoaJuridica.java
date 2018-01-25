package aula36a43.labsexer02;

public class PessoaJuridica extends Contribuinte{

	private int imposto = 10;
	private String cnpj;
	
	public int getImposto() {
		return imposto;
	}
	public void setImposto(int imposto) {
		this.imposto = imposto;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	@Override
	public double calcularImposto() {
		return (this.getRendaBruta() * this.getImposto())/100;		
	}
	
	@Override
	public String toString() {
		String s = "Pessoa Jurídica[";
		s += super.toString();
		s += " ;cnpj: " + cnpj;
		s += " ;imposto a ser pago: " + calcularImposto();
		return s;
	}
	
}
