package ResultadoEscolar;

public class ResultadoTernario {

	public static void main(String[] args) {
		
		int nota = 6;
		
		String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
		
		System.out.println(resultado);
		
		resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperacao" : "Reprovado";
		
		System.out.println(resultado);
		
		
	}

}
