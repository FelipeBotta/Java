package ExemploFor;

//em alunos2 temos esse for em string de maneira sintetizada, economizando linhas

public class alunos {

	public static void main(String[] args) {
		
		String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos"};
		
		for (int x=0; x < alunos.length; x++) {
			
			System.out.println("O aluno no indice x= " + x + " eh " + alunos[x]);
		}
	
	}

}
