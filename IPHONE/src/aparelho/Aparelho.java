package aparelho;

import funcionalidades.ReprodutorMusical;
import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;

public class Aparelho implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

	@Override
	public void exibirPagina() {
		String pagina = "Google";
		System.out.println("Exibindo a pagina selecionada: " + pagina);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando a pagina");
		
	}

	@Override
	public void ligar() {
		String contato = "Mae";
		System.out.println("Ligando para o contato " + contato);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligacao");		
	}

	@Override
	public void correioDeVoz() {
		System.out.println("Ligando para o correio de voz");
	}

	@Override
	public void tocar() {
		System.out.println("Play no reprodutor de musica");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pause no reprodutor de musica");
		
	}

	@Override
	public void selecionarMusica() {
		String musica = "Palhas do Coqueiro";
		
		System.out.println("Reproduzindo musica " + musica);
	}
	
	
}
