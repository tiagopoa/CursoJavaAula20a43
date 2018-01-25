package aula36a43.labsexer03;

public class Teste {

	public static void main(String[] args) {


		Mamifero camelo = new Mamifero();
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setNumPatas(4);
		camelo.setCor("amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidade(2);
		
		Peixe tubarao = new Peixe();
		tubarao.setNome("tubarão");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(1.5);
		tubarao.setCaracteristica("Barbatanas e cauda");
		
		Mamifero ursoDoCanada = new Mamifero();
		ursoDoCanada.setNome("Urso-do-canadá");
		ursoDoCanada.setComprimento(180);
		ursoDoCanada.setNumPatas(4);
		ursoDoCanada.setCor("vermelho");
		ursoDoCanada.setAmbiente("Terra");
		ursoDoCanada.setVelocidade(0.5);
		ursoDoCanada.setAlimento("Mel");
		
		Animal[] animais = new Animal[3];		
		animais[0] = camelo;
		animais[1] = tubarao;
		animais[2] = ursoDoCanada;
		
		System.out.println("Zoo:");
		System.out.println("---------------");
		for (Animal a : animais) {			
			System.out.println(a);
			System.out.println("---------------");
			
		}

	}

}
