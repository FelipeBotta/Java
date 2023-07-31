package aparelho;

import funcionalidades.ReprodutorMusical;
import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;

public class Aparelho implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

	@Override
	public void exibirPagina() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void autalizarPagina() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void correioDeVoz() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selecionarMusica() {
		String musica = "Palhas do Coqueiro";
		
		System.out.println("Reproduzindo musica " + musica);
	}
	
	
}
