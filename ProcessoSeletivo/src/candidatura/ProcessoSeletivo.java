package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		selecaoCandidatos();
		
		
	}
		
	static void selecaoCandidatos() {
		String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio","Mirela","Daniela","Jordan"};
		
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase= 2000.0;
		
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O cadidato " + candidato + " Solicitou este salario " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
	
	}
		
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o Candidato");
		} else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para o Candidato com Contra Proposta");
		} else {
			System.out.println("Aguardando demais Candidatos");
		}
		
	}}

