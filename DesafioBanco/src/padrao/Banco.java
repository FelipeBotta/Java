package padrao;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nome;
	public ArrayList<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}

	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}
	
	public void listaClientes() {
		contas.forEach((n) -> System.out.println(n));
	}
	
	}

