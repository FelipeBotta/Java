package aparelho;

public class Usuario {
	
	public static void main(String[] args) {
		
	Aparelho iphone = new Aparelho();
	
	System.out.println("Funcionalidades do Ipod : \n");
	iphone.tocar();
	iphone.selecionarMusica();
	iphone.pausar();
	
	System.out.println("\nFuncionalidades de um celular : \n");
	
	iphone.atender();
	iphone.correioDeVoz();
	iphone.ligar();
	
	System.out.println("\nFuncionalidades do navegador de internet : \n");
	
	iphone.atualizarPagina();
	iphone.adicionarNovaAba();
	iphone.exibirPagina();

		
	}
	
	
	

	
	

}
