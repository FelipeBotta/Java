package desafio;

import java.util.Scanner;

public class DesafioControleFluxo {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		int numeroUm = sc.nextInt();
		
		System.out.println("Digite o segundo numero");
		int numeroDois = sc.nextInt();
		
		try {
			contar(numeroUm,numeroDois);
			
		} catch (NumeroInvalidoException e) {
			
			System.err.println("O segundo numero deve ser maior que o primeiro");
		}
		
		
	}
	
	static void contar(int numeroUm, int numeroDois) throws NumeroInvalidoException{
		int contagem = numeroDois - numeroUm;
		if(contagem <0) {
			System.err.println("O segundo numero deve ser maior que o primeiro");
		} else {
			for(int i = 0; i < contagem; i++) {
				System.out.println(i+1);
			}
		}
	}
	
	public class NumeroInvalidoException extends Exception{}
}
