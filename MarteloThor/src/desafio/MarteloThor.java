package desafio;
import java.util.Scanner;
public class MarteloThor {

	    public static void main(String[] args){
			try (Scanner leitor = new Scanner(System.in)) {
				int C = leitor.nextInt();
				
				String nome = "";
				
				int N;

				for (int i = 0; i < C  ; i++) {
					nome = leitor.next();
					N = leitor.nextInt();
					if (nome.equals("Thor") && N >=25000) System.out.println("Y");
					else System.out.println("N");
				}
			}
	    }
		
	}

