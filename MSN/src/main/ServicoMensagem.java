package main;

public abstract class ServicoMensagem {
	
	public abstract void enviarMensagem();
	
	public abstract void receberMensagem();
	
	protected abstract void salvarHistorico();
	
	protected void validarConectado() {
		System.out.println("Validando se esta conectado a internet");
	}
}