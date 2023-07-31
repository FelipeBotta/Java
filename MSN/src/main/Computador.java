package main;

public class Computador {
	
	public static void main(String[] args) {
		ServicoMensagem sm = null;
		
		String app = "tele";
		
		if(app.equals("msn")) {
			sm = new MSNMessenger();
		}
		else if(app.equals("fb")) {
			sm = new FacebookMessenger();
		}
		else if(app.equals("tele")) {
			sm = new Telegram();
		}
		
		sm.enviarMensagem();
		sm.receberMensagem();
	}

}
