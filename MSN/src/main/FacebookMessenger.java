package main;

public class FacebookMessenger extends ServicoMensagem {
	
	@Override
	public void enviarMensagem() {
		validarConectado();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
		salvarHistorico();
	}
	
	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
	
	@Override
	protected void salvarHistorico() {
		System.out.println("Salvando historico na nuvem do Facebook");
	}

}
