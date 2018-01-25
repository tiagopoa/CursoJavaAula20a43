package aula36a43.labsexer03;

public class Peixe extends Animal{
	
		private static final int patas = 0;
		private static final String ambiente = "mar";
		private static final String cor = "cinzento";
		private String caracteristica;
		
		

		public String getCaracteristica() {
			return caracteristica;
		}

		public void setCaracteristica(String caracteristica) {
			this.caracteristica = caracteristica;
		}

		
		
		public static int getPatas() {
			return patas;
		}
		public String getAmbiente() {
			return ambiente;
		}
		public String getCor() {
			return cor;
		}

		@Override
		public String toString() {
			return super.toString() + "\nCaracterística: " + caracteristica;
		}
		

		

		
		
		

}
