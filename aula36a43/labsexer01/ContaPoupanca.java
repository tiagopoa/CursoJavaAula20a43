package aula36a43.labsexer01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{

	private double diaRendimento;

	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public boolean calcularNovoSaldo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			super.setSaldo(super.getSaldo() + (super.getSaldo() * taxaRendimento));
			return true;
		} 
			return false;		
		//super.setSaldo(super.getSaldo()+((super.getSaldo()*taxa)/100));
	}
	
	@Override
	public String toString() {
		String s = "ContaPoupança[";
		s += " diaRendimento: " + diaRendimento;
		s += super.toString();
		s += "]";
		return s;
		//return super.toString();
	}
	
	
	
}
