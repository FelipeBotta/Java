package main;

public class Telegram extends ServicoMensagem {
	
	
	@Override
	public void enviarMensagem() {
		validarConectado();
		System.out.println("Enviando mensagem pelo Telegram");
		salvarHistorico();
	}
	
	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
	
	@Override
	protected void salvarHistorico() {
		System.out.println("Salvando historico na nuvem do Telegram");
	}
}
