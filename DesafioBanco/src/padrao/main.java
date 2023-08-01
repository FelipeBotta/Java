package padrao;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		List<Conta> contas  = new ArrayList<>();
		Cliente luis = new Cliente();
		luis.setNome("Luis Felipe");
		Cliente felipe = new Cliente();
		felipe.setNome("Felipe");
		
		Conta cc = new ContaCorrente(luis);
		Conta poupanca = new ContaPoupanca(luis);
		Conta cc1 = new ContaCorrente(felipe);
		Conta poupanca1 = new ContaPoupanca(felipe);
		
		
		
		cc.depoisitar(200);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();
		
		contas.add(poupanca1);
		contas.add(poupanca);
		contas.add(cc);
		contas.add(cc1);
		banco.setContas(contas);
		
		System.out.println("\nLista de Contas: ");
		banco.listarContas();
	}
	
	

}
