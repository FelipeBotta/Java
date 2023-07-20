package Metodos;

public class Usuario {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("TV Ligada ? " + smartTv.ligada);
		System.out.println("Canal Atual " + smartTv.canal);
		System.out.println("Volume Atual " + smartTv.volume);
		
		
		smartTv.ligar();
		
		
		smartTv.aumentarCanal();
		
		
		smartTv.diminuirCanal();
		
		
		smartTv.aumentarVolume();
		
		
		smartTv.diminuirVolume();
		
		
		smartTv.mudarCanal(55);
		

		smartTv.desligar();
		

		

		
		
		
		
	}

}
