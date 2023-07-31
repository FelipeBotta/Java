package main;

public class Computador {
	
	public static void main(String[] args) {
		
		MSNMessenger msn = new MSNMessenger();
		
		Telegram tele = new Telegram();
		
		FacebookMessenger face = new FacebookMessenger();
		
		msn.enviarMensagem();
		
		msn.receberMensagem();
		
		tele.enviarMensagem();
		
		tele.receberMensagem();
		
		face.enviarMensagem();
		
		face.receberMensagem();
	}

}
