package aula25a27.Labs;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lampada lampada1 = new Lampada();
		
		lampada1.potencia = 30;
		lampada1.preco = 29.9;
		
		System.out.println("Pot�ncia: " + lampada1.potencia);
		System.out.println("Pre�o: " + lampada1.preco);
		System.out.println("A lampada est� " + lampada1.ligar());
		System.out.println("A lampada est� " + lampada1.desligar());

	}

}
