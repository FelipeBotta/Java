package pilares;

public class Carro extends Veiculo {
	

	
	
	public void ligar() {
		cambio();
		combustivel();
		System.out.println("Carro ligado !");
	}
	
	private void combustivel() {
		System.out.println("Conferindo combustivel");
	}
	
	private void cambio() {
		System.out.println("Conferindo cambio em P");
	}

}
