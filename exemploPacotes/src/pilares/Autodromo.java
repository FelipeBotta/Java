package pilares;

public class Autodromo {
	public static void main(String[] args) {
		Carro bmw = new Carro();
		bmw.setChassi("1337");
		//bmw.ligar();
		
		
		Moto cb300 = new Moto();
		cb300.setChassi("1234");
		//cb300.ligar();
		
		Veiculo coringa = cb300;
		
		coringa.ligar();
				
				
	}
	
	
	
	
	
	

}
