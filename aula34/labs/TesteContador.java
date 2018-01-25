package aula34.labs;

public class TesteContador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Informa numero inicial: " + Contador.retornaNum());
		
		System.out.println("Incrementa 1: " + Contador.incrementar());
		System.out.println("Incrementa 1: " + Contador.incrementar());
		System.out.println("Incrementa 1: " + Contador.incrementar());
		
		System.out.println("Informa numero apos incrementos: " + Contador.retornaNum());
		
		System.out.println("Zera contador: " + Contador.zerar());
		
		System.out.println("Informa numero: " + Contador.retornaNum());

	}

}
