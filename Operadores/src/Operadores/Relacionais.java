package Operadores;

public class Relacionais {

	public static void main(String[] args) {
		String nome1 = "Luis";
		String nome2 = new String ("Luis");
		
		System.out.println(nome1.equals(nome2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		int numero1 = 1;
		int numero2 = 2;
		
		boolean simNao = numero1 == numero2;
		
		if(numero1 < numero2) {
			System.out.println("a nossa condicao eh verdadeira !");
		}
		
		System.out.println("numeroUm eh igual a numeroDois " + simNao);
		
		simNao = numero1 != numero2;
		
		System.out.println("numeroUm eh diferente de numeroDois " + simNao);
		
		simNao = numero1 > numero2;
		
		System.out.println("numeroUm eh maior que numeroDois " + simNao);
	}

}
