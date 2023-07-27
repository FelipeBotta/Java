package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {

	public static void main(String[] args) {
		
		Cozinheiro cozinheiro = new Cozinheiro();
		
		//acoes que nao precisam estarem disponiveis para toda a aplicacao
		cozinheiro.lavarIngredientes();
		cozinheiro.baterVitaminaLiquidificador();
		cozinheiro.selecionarIngredientesVitamina();
		cozinheiro.prepararLanche();
		cozinheiro.prepararVitamina();
		cozinheiro.prepararVitamina();
		
		//acoes que o estabelecimento precisa ter ciencia
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Almoxarife almoxarife = new Almoxarife();
		
		//acoes que nao precisam estarem disponiveis para toda a aplicacao
		almoxarife.controlarEntrada();
		almoxarife.controlarSaida();
		//acao que somente o seu pacote cozinha precisa conhecer
		almoxarife.entregarIngredientes();
		almoxarife.trocarGas();
		
		Atendente atendente = new Atendente();
		
		atendente.pegarLancheCozinha();
		atendente.receberPagamento();
		atendente.servindoMesa();
		//acao que somente o seu pacote cozinha precisa saber
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		cliente.pegarPedidoBalcao();
		
		cliente.consultarSaldoAplicativo();
		
		cozinheiro.pedirParaTrocarGas(atendente);
		cozinheiro.pedirParaTrocarGas(almoxarife);
		
	}

}
