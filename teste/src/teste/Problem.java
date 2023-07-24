package teste;

	import java.util.*; 
	public class Problem {
	    public static void main(String[] args) {
	      	Scanner leitor = new Scanner(System.in);
	    	int N = leitor.nextInt();
	    	String jogador1, jogador2;
	    	for (int i = 0; i < N; i++) {
	    		jogador1 = leitor.next();
	    		jogador2 = leitor.next();
	    		
	    	  if(jogador1.equalsIgnoreCase("ataque")) {
	            if(jogador2.equalsIgnoreCase("ataque")) {
	                System.out.println("Aniquilação Total");
	            }
	            if(jogador2.equalsIgnoreCase("pedra")) {
	                System.out.println("Jogador 1 venceu");
	            }
	            if(jogador2.equalsIgnoreCase("Papel")) {
	                System.out.println("Jogador 1 venceu");
	            }
	        }
	        if(jogador1.equalsIgnoreCase("pedra")) {
	            if(jogador2.equalsIgnoreCase("ataque")) {
	                System.out.println("Jogador 2 venceu");
	            }
	            if(jogador2.equalsIgnoreCase("pedra")) {
	                System.out.println("Sem ganhador");
	            }
	            if(jogador2.equalsIgnoreCase("papel")) {
	                System.out.println("Jogador 1 venceu");
	            }
	        }
	        if(jogador1.equalsIgnoreCase("papel")) {
	            if(jogador2.equalsIgnoreCase("ataque")) {
	                System.out.println("Jogador 2 venceu");
	            }
	            if(jogador2.equalsIgnoreCase("pedra")) {
	                System.out.println("Jogador 2 venceu");
	            }
	            if(jogador2.equalsIgnoreCase("papel")) {
	                System.out.println("Ambos venceram");
	            }
	        }
	    		}
	    }
	}
	    
