package main;

public class ServicoMensagem {
	
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem");
		salvarHistoricoMensagem();
		}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	
	public void validarConectadoInternet() {
		System.out.println("Verificando conexao com a internet");
	}
	
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando historico de mensagens");
	}
		

	

}