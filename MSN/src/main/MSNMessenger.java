package main;

public class MSNMessenger extends ServicoMensagem {
	
	@Override
	public void enviarMensagem() {
		validarConectado();
		System.out.println("Enviando mensagem pelo MSN");
		salvarHistorico();
	}
	
	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN");
	}
	
	@Override
	protected void salvarHistorico() {
		System.out.println("Salvando historico na nuvem do MSN");
	}
	
	

}
