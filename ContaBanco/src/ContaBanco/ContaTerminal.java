package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) throws Exception {
		
		int numero = 0;
		String agencia = "";
		String nomeCliente = "";
		double saldo = 0.0;
		
		 Scanner sc = new Scanner(System.in);
		 	
		 	try {
		 
			System.out.println("Por favor, digite o numero da agencia: ");
			
			agencia = sc.next();
			
			System.out.println("Por favor, digite o numero da conta: ");
			
			numero = sc.nextInt();
			
			System.out.println("Por favor, digite o seu nome completo: ");
			
			nomeCliente = sc.next();
			
			System.out.println("Por favor, indique o saldo inicial: ");
			
			saldo = sc.nextDouble();
		
		System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco \n sua agencia eh " + agencia + " conta " + numero + "\n seu saldo " + saldo + " ja esta disponivel pra saque");
		 	} finally{
		sc.close();
		
		 	}
		
		
		
	}

}
